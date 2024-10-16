package stdgui.data.model.modelwrapper;


    
    


     

public class RequestGroupRefWrapper {

    
    
    private RequestGroupRef requestGroupRef;

    public RequestGroupRefWrapper(RequestGroupRef requestGroupRef) {
        this.requestGroupRef = requestGroupRef;
    }

   
    public SystemSignalGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requestGroupRef.getDest())) {
            
            return requestGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequestGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requestGroupRef.getValue();
        java.lang.String type = requestGroupRef.getDest().toString().replace("_", "-");
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

    
    public SystemSignalGroupWrapper getSystemSignalGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requestGroupRef.getValue();
        java.lang.String type = requestGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignalGroup){
            return new SystemSignalGroupWrapper((SystemSignalGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}