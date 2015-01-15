/**
 */
package mdn.util;

import mdn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage
 * @generated
 */
public class MdnAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MdnPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdnAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MdnPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdnSwitch<Adapter> modelSwitch =
    new MdnSwitch<Adapter>()
    {
      @Override
      public Adapter caseSdn(Sdn object)
      {
        return createSdnAdapter();
      }
      @Override
      public Adapter caseController(Controller object)
      {
        return createControllerAdapter();
      }
      @Override
      public Adapter caseHost(Host object)
      {
        return createHostAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseNetworkNode(NetworkNode object)
      {
        return createNetworkNodeAdapter();
      }
      @Override
      public Adapter casePolicy(Policy object)
      {
        return createPolicyAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseTraffic(Traffic object)
      {
        return createTrafficAdapter();
      }
      @Override
      public Adapter caseTime(Time object)
      {
        return createTimeAdapter();
      }
      @Override
      public Adapter casePacketHeader(PacketHeader object)
      {
        return createPacketHeaderAdapter();
      }
      @Override
      public Adapter casePolicyObject(PolicyObject object)
      {
        return createPolicyObjectAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link mdn.Sdn <em>Sdn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Sdn
   * @generated
   */
  public Adapter createSdnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Controller
   * @generated
   */
  public Adapter createControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Host <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Host
   * @generated
   */
  public Adapter createHostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.NetworkNode <em>Network Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.NetworkNode
   * @generated
   */
  public Adapter createNetworkNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Policy
   * @generated
   */
  public Adapter createPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Traffic <em>Traffic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Traffic
   * @generated
   */
  public Adapter createTrafficAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.Time
   * @generated
   */
  public Adapter createTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.PacketHeader <em>Packet Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.PacketHeader
   * @generated
   */
  public Adapter createPacketHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdn.PolicyObject <em>Policy Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdn.PolicyObject
   * @generated
   */
  public Adapter createPolicyObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MdnAdapterFactory
