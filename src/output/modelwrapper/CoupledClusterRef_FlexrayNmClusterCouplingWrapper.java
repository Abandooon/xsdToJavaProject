package stdgui.data.model.modelwrapper;


    
    


     

public class CoupledClusterRef_FlexrayNmClusterCouplingWrapper {

    
    
    private CoupledClusterRef_FlexrayNmClusterCoupling coupledClusterRef_FlexrayNmClusterCoupling;

    public CoupledClusterRef_FlexrayNmClusterCouplingWrapper(CoupledClusterRef_FlexrayNmClusterCoupling coupledClusterRef_FlexrayNmClusterCoupling) {
        this.coupledClusterRef_FlexrayNmClusterCoupling = coupledClusterRef_FlexrayNmClusterCoupling;
    }

   
    public FlexrayNmClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(coupledClusterRef_FlexrayNmClusterCoupling.getDest())) {
            
            return coupledClusterRef_FlexrayNmClusterCoupling.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCoupledClusterRef_FlexrayNmClusterCouplingObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = coupledClusterRef_FlexrayNmClusterCoupling.getValue();
        java.lang.String type = coupledClusterRef_FlexrayNmClusterCoupling.getDest().toString().replace("_", "-");
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

    
    public FlexrayNmClusterWrapper getFlexrayNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = coupledClusterRef_FlexrayNmClusterCoupling.getValue();
        java.lang.String type = coupledClusterRef_FlexrayNmClusterCoupling.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayNmCluster){
            return new FlexrayNmClusterWrapper((FlexrayNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}