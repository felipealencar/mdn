# -*- coding: utf-8 -*-

# Licensed under the Apache License, Version 2.0 (the "License"); you may
# not use this file except in compliance with the License. You may obtain
# a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# License for the specific language governing permissions and limitations
# under the License.

# This is a collector instance for NetFlow V5. OpenVirtualSwitch doesn't
# support NetFlow V9 for getting MPLS headers from the packets.

from ryu import cfg
from ryu.base import app_manager
from ryu.lib import hub
from ryu.lib.xflow import netflow

opts = [cfg.StrOpt('address', default='127.0.0.1',
                   help='NetFlow Collector bind address'),
        cfg.IntOpt('port', default=3000,
                   help='NetFlow Collector port'),
        cfg.IntOpt('max_udp_msg_size', default=1472,
                   help='Maximum size of UDP messages')]

cfg.CONF.register_opts(opts, 'plow')


class NetFlow(app_manager.RyuApp):
    def __init__(self, *args, **kwargs):
        super(NetFlow, self).__init__(*args, **kwargs)
        self._address = self.CONF.plow.address
        self._port = self.CONF.plow.port
        self._udp_msg_size = self.CONF.plow.max_udp_msg_size
        self._udp_sock = None
	#print ('self',self)

    def _handle(self, buf, addr):

        packet = netflow.NetFlow.parser(buf)
        
        if not packet:
            print('not a packet')
            return

	print packet.__dict__
	print ('teste')
	#netflow object \/
	#print('self',self)
	netflowPacket = packet.__dict__
	#print('netflowPacket', netflowPacket)
	for flow in netflowPacket['flows']:
	    print('flow',flow.__dict__)
	    #TODO: Talvez a maneira correta de fazer isso seja analisar 
	    #      somente os src/dst addr que estejam conectados ao switch em
	    #      questao
	    #TODO: Os addr estao em Quad Decimal (Long) - ipconverter
	    #if flow.srcaddr == '192.168.1.1':
	    #	print 

    def _recv_loop(self):
        self.logger.info('Listening on %s:%s for netflow agents' %
                         (self._address, self._port))

        while True:
            buf, addr = self._udp_sock.recvfrom(self._udp_msg_size)
            t = hub.spawn(self._handle, buf, addr)
            self.threads.append(t)

    def start(self):
        self._udp_sock = hub.socket.socket(hub.socket.AF_INET,
                                           hub.socket.SOCK_DGRAM)
        self._udp_sock.bind((self._address, self._port))

        t = hub.spawn(self._recv_loop)
	    #PRA O sFLOW vai dar certo
        super(NetFlow, self).start()
	    #TODO: Talvez outra forma seja identificar o DATAPATH do switch
	    #TODO: Casar as informaçoes do NETCONF em um arquivo com as
	    #      informacoes do switch        
        return t
