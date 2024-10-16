package stdgui.data.model.modelwrapper;


    
    


     

public class ParameterAccessedForDebugRefWrapper {

    
    
    private ParameterAccessedForDebugRef parameterAccessedForDebugRef;

    public ParameterAccessedForDebugRefWrapper(ParameterAccessedForDebugRef parameterAccessedForDebugRef) {
        this.parameterAccessedForDebugRef = parameterAccessedForDebugRef;
    }

   
    public ParameterDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(parameterAccessedForDebugRef.getDest())) {
            
            return parameterAccessedForDebugRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getParameterAccessedForDebugRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = parameterAccessedForDebugRef.getValue();
        java.lang.String type = parameterAccessedForDebugRef.getDest().toString().replace("_", "-");
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

    
    public ParameterDataPrototypeWrapper getParameterDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = parameterAccessedForDebugRef.getValue();
        java.lang.String type = parameterAccessedForDebugRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterDataPrototype){
            return new ParameterDataPrototypeWrapper((ParameterDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}