package stdgui.data.model.modelwrapper;


    
    


     

public class BaseRef_SwcServiceDependencyInCompositionInstanceRefWrapper {

    
    
    private BaseRef_SwcServiceDependencyInCompositionInstanceRef baseRef_SwcServiceDependencyInCompositionInstanceRef;

    public BaseRef_SwcServiceDependencyInCompositionInstanceRefWrapper(BaseRef_SwcServiceDependencyInCompositionInstanceRef baseRef_SwcServiceDependencyInCompositionInstanceRef) {
        this.baseRef_SwcServiceDependencyInCompositionInstanceRef = baseRef_SwcServiceDependencyInCompositionInstanceRef;
    }

   
    public CompositionSwComponentTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(baseRef_SwcServiceDependencyInCompositionInstanceRef.getDest())) {
            
            return baseRef_SwcServiceDependencyInCompositionInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBaseRef_SwcServiceDependencyInCompositionInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = baseRef_SwcServiceDependencyInCompositionInstanceRef.getValue();
        java.lang.String type = baseRef_SwcServiceDependencyInCompositionInstanceRef.getDest().toString().replace("_", "-");
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

    
    public CompositionSwComponentTypeWrapper getCompositionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef_SwcServiceDependencyInCompositionInstanceRef.getValue();
        java.lang.String type = baseRef_SwcServiceDependencyInCompositionInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompositionSwComponentType){
            return new CompositionSwComponentTypeWrapper((CompositionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}