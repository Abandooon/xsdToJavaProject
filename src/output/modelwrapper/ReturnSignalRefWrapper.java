package stdgui.data.model.modelwrapper;


    
    


     

public class ReturnSignalRefWrapper {

    
    
    private ReturnSignalRef returnSignalRef;

    public ReturnSignalRefWrapper(ReturnSignalRef returnSignalRef) {
        this.returnSignalRef = returnSignalRef;
    }

   
    public SystemSignalSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(returnSignalRef.getDest())) {
            
            return returnSignalRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReturnSignalRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = returnSignalRef.getValue();
        java.lang.String type = returnSignalRef.getDest().toString().replace("_", "-");
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

    
    public SystemSignalWrapper getSystemSignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = returnSignalRef.getValue();
        java.lang.String type = returnSignalRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignal){
            return new SystemSignalWrapper((SystemSignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}