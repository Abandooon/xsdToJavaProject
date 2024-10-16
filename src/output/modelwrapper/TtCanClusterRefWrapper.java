package stdgui.data.model.modelwrapper;


    
    


     

public class TtCanClusterRefWrapper {

    
    
    private TtCanClusterRef ttCanClusterRef;

    public TtCanClusterRefWrapper(TtCanClusterRef ttCanClusterRef) {
        this.ttCanClusterRef = ttCanClusterRef;
    }

   
    public TtcanClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ttCanClusterRef.getDest())) {
            
            return ttCanClusterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTtCanClusterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ttCanClusterRef.getValue();
        java.lang.String type = ttCanClusterRef.getDest().toString().replace("_", "-");
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

    
    public TtcanClusterWrapper getTtcanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ttCanClusterRef.getValue();
        java.lang.String type = ttCanClusterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCluster){
            return new TtcanClusterWrapper((TtcanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}