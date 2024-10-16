package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

public class TypeTref_ArgumentDataPrototypeWrapper {

    
    
    private TypeTref_ArgumentDataPrototype typeTref_ArgumentDataPrototype;

    public TypeTref_ArgumentDataPrototypeWrapper(TypeTref_ArgumentDataPrototype typeTref_ArgumentDataPrototype) {
        this.typeTref_ArgumentDataPrototype = typeTref_ArgumentDataPrototype;
    }

   
    public AutosarDataTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(typeTref_ArgumentDataPrototype.getDest())) {
            
            return typeTref_ArgumentDataPrototype.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTypeTref_ArgumentDataPrototypeObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = typeTref_ArgumentDataPrototype.getValue();
        java.lang.String type = typeTref_ArgumentDataPrototype.getDest().toString().replace("_", "-");
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

    
    public ApplicationArrayDataTypeWrapper getApplicationArrayDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = typeTref_ArgumentDataPrototype.getValue();
        java.lang.String type = typeTref_ArgumentDataPrototype.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayDataType){
            return new ApplicationArrayDataTypeWrapper((ApplicationArrayDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationPrimitiveDataTypeWrapper getApplicationPrimitiveDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = typeTref_ArgumentDataPrototype.getValue();
        java.lang.String type = typeTref_ArgumentDataPrototype.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationPrimitiveDataType){
            return new ApplicationPrimitiveDataTypeWrapper((ApplicationPrimitiveDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationRecordDataTypeWrapper getApplicationRecordDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = typeTref_ArgumentDataPrototype.getValue();
        java.lang.String type = typeTref_ArgumentDataPrototype.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordDataType){
            return new ApplicationRecordDataTypeWrapper((ApplicationRecordDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ImplementationDataTypeWrapper getImplementationDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = typeTref_ArgumentDataPrototype.getValue();
        java.lang.String type = typeTref_ArgumentDataPrototype.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataType){
            return new ImplementationDataTypeWrapper((ImplementationDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}