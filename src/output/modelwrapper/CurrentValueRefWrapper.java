package stdgui.data.model.modelwrapper;


    
    


     

public class CurrentValueRefWrapper {

    
    
    private CurrentValueRef currentValueRef;

    public CurrentValueRefWrapper(CurrentValueRef currentValueRef) {
        this.currentValueRef = currentValueRef;
    }

   
    public DiagnosticValueNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(currentValueRef.getDest())) {
            
            return currentValueRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCurrentValueRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = currentValueRef.getValue();
        java.lang.String type = currentValueRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticValueNeedsWrapper getDiagnosticValueNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = currentValueRef.getValue();
        java.lang.String type = currentValueRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticValueNeeds){
            return new DiagnosticValueNeedsWrapper((DiagnosticValueNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}