package stdgui.data.model.modelwrapper;


    
    


     

public class NmPduRefWrapper {

    
    
    private NmPduRef nmPduRef;

    public NmPduRefWrapper(NmPduRef nmPduRef) {
        this.nmPduRef = nmPduRef;
    }

   
    public NmPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(nmPduRef.getDest())) {
            
            return nmPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getNmPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = nmPduRef.getValue();
        java.lang.String type = nmPduRef.getDest().toString().replace("_", "-");
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

    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmPduRef.getValue();
        java.lang.String type = nmPduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}