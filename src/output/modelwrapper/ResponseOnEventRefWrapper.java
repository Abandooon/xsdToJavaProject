package stdgui.data.model.modelwrapper;


    
    


     

public class ResponseOnEventRefWrapper {

    
    
    private ResponseOnEventRef responseOnEventRef;

    public ResponseOnEventRefWrapper(ResponseOnEventRef responseOnEventRef) {
        this.responseOnEventRef = responseOnEventRef;
    }

   
    public TpConnectionIdentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(responseOnEventRef.getDest())) {
            
            return responseOnEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getResponseOnEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = responseOnEventRef.getValue();
        java.lang.String type = responseOnEventRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = responseOnEventRef.getValue();
        java.lang.String type = responseOnEventRef.getDest().toString().replace("_", "-");
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