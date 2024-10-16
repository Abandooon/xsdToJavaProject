package stdgui.data.model.modelwrapper;


    
    


     

public class PerInstanceParameterRefWrapper {

    
    
    private PerInstanceParameterRef perInstanceParameterRef;

    public PerInstanceParameterRefWrapper(PerInstanceParameterRef perInstanceParameterRef) {
        this.perInstanceParameterRef = perInstanceParameterRef;
    }

   
    public ParameterDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(perInstanceParameterRef.getDest())) {
            
            return perInstanceParameterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPerInstanceParameterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = perInstanceParameterRef.getValue();
        java.lang.String type = perInstanceParameterRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = perInstanceParameterRef.getValue();
        java.lang.String type = perInstanceParameterRef.getDest().toString().replace("_", "-");
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