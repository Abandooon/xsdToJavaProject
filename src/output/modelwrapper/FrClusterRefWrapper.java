package stdgui.data.model.modelwrapper;


    
    


     

public class FrClusterRefWrapper {

    
    
    private FrClusterRef frClusterRef;

    public FrClusterRefWrapper(FrClusterRef frClusterRef) {
        this.frClusterRef = frClusterRef;
    }

   
    public FlexrayClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(frClusterRef.getDest())) {
            
            return frClusterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFrClusterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = frClusterRef.getValue();
        java.lang.String type = frClusterRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayClusterWrapper getFlexrayCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frClusterRef.getValue();
        java.lang.String type = frClusterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCluster){
            return new FlexrayClusterWrapper((FlexrayCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}