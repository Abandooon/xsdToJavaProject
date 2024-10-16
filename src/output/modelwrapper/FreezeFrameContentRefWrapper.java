package stdgui.data.model.modelwrapper;


    
    


     

public class FreezeFrameContentRefWrapper {

    
    
    private FreezeFrameContentRef freezeFrameContentRef;

    public FreezeFrameContentRefWrapper(FreezeFrameContentRef freezeFrameContentRef) {
        this.freezeFrameContentRef = freezeFrameContentRef;
    }

   
    public DiagnosticDataIdentifierSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(freezeFrameContentRef.getDest())) {
            
            return freezeFrameContentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFreezeFrameContentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = freezeFrameContentRef.getValue();
        java.lang.String type = freezeFrameContentRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDataIdentifierSetWrapper getDiagnosticDataIdentifierSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = freezeFrameContentRef.getValue();
        java.lang.String type = freezeFrameContentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataIdentifierSet){
            return new DiagnosticDataIdentifierSetWrapper((DiagnosticDataIdentifierSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}