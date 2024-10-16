package stdgui.data.model.modelwrapper;


    
    


     

public class CoupledClusterRefWrapper {

    
    
    private CoupledClusterRef coupledClusterRef;

    public CoupledClusterRefWrapper(CoupledClusterRef coupledClusterRef) {
        this.coupledClusterRef = coupledClusterRef;
    }

   
    public CanNmClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(coupledClusterRef.getDest())) {
            
            return coupledClusterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCoupledClusterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = coupledClusterRef.getValue();
        java.lang.String type = coupledClusterRef.getDest().toString().replace("_", "-");
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

    
    public CanNmClusterWrapper getCanNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = coupledClusterRef.getValue();
        java.lang.String type = coupledClusterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanNmCluster){
            return new CanNmClusterWrapper((CanNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}