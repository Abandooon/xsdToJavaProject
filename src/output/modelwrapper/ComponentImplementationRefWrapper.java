package stdgui.data.model.modelwrapper;


    
    


     

public class ComponentImplementationRefWrapper {

    
    
    private ComponentImplementationRef componentImplementationRef;

    public ComponentImplementationRefWrapper(ComponentImplementationRef componentImplementationRef) {
        this.componentImplementationRef = componentImplementationRef;
    }

   
    public SwcImplementationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(componentImplementationRef.getDest())) {
            
            return componentImplementationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getComponentImplementationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = componentImplementationRef.getValue();
        java.lang.String type = componentImplementationRef.getDest().toString().replace("_", "-");
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

    
    public SwcImplementationWrapper getSwcImplementation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = componentImplementationRef.getValue();
        java.lang.String type = componentImplementationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcImplementation){
            return new SwcImplementationWrapper((SwcImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}