package stdgui.data.model.modelwrapper;


    
    


     

public class ResponseRefWrapper {

    
    
    private ResponseRef responseRef;

    public ResponseRefWrapper(ResponseRef responseRef) {
        this.responseRef = responseRef;
    }

   
    public TpConnectionIdentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(responseRef.getDest())) {
            
            return responseRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getResponseRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = responseRef.getValue();
        java.lang.String type = responseRef.getDest().toString().replace("_", "-");
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

    
    public TpConnectionIdentWrapper getTpConnectionIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef.getValue();
        java.lang.String type = responseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TpConnectionIdent){
            return new TpConnectionIdentWrapper((TpConnectionIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}