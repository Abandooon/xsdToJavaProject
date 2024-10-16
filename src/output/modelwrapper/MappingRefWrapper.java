package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

public class MappingRefWrapper {

    
    
    private MappingRef mappingRef;

    public MappingRefWrapper(MappingRef mappingRef) {
        this.mappingRef = mappingRef;
    }

   
    public PortInterfaceMappingSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(mappingRef.getDest())) {
            
            return mappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = mappingRef.getValue();
        java.lang.String type = mappingRef.getDest().toString().replace("_", "-");
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

    
    public ClientServerInterfaceMappingWrapper getClientServerInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mappingRef.getValue();
        java.lang.String type = mappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterfaceMapping){
            return new ClientServerInterfaceMappingWrapper((ClientServerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeInterfaceMappingWrapper getModeInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mappingRef.getValue();
        java.lang.String type = mappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeInterfaceMapping){
            return new ModeInterfaceMappingWrapper((ModeInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceMappingWrapper getTriggerInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mappingRef.getValue();
        java.lang.String type = mappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterfaceMapping){
            return new TriggerInterfaceMappingWrapper((TriggerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableAndParameterInterfaceMappingWrapper getVariableAndParameterInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mappingRef.getValue();
        java.lang.String type = mappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAndParameterInterfaceMapping){
            return new VariableAndParameterInterfaceMappingWrapper((VariableAndParameterInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}