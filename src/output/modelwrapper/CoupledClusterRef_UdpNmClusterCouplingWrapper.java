package stdgui.data.model.modelwrapper;


    
    


     

public class CoupledClusterRef_UdpNmClusterCouplingWrapper {

    
    
    private CoupledClusterRef_UdpNmClusterCoupling coupledClusterRef_UdpNmClusterCoupling;

    public CoupledClusterRef_UdpNmClusterCouplingWrapper(CoupledClusterRef_UdpNmClusterCoupling coupledClusterRef_UdpNmClusterCoupling) {
        this.coupledClusterRef_UdpNmClusterCoupling = coupledClusterRef_UdpNmClusterCoupling;
    }

   
    public UdpNmClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(coupledClusterRef_UdpNmClusterCoupling.getDest())) {
            
            return coupledClusterRef_UdpNmClusterCoupling.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCoupledClusterRef_UdpNmClusterCouplingObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = coupledClusterRef_UdpNmClusterCoupling.getValue();
        java.lang.String type = coupledClusterRef_UdpNmClusterCoupling.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public UdpNmClusterWrapper getUdpNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = coupledClusterRef_UdpNmClusterCoupling.getValue();
        java.lang.String type = coupledClusterRef_UdpNmClusterCoupling.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UdpNmCluster){
            return new UdpNmClusterWrapper((UdpNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}