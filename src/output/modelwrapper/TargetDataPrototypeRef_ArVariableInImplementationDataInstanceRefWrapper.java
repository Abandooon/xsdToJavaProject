package stdgui.data.model.modelwrapper;


    
    


     

public class TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper {

    
    
    private TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef;

    public TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper(TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef) {
        this.targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef = targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef;
    }

   
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest())) {
            
            return targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetDataPrototypeRef_ArVariableInImplementationDataInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest().toString().replace("_", "-");
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

    
    public ImplementationDataTypeElementWrapper getImplementationDataTypeElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getValue();
        java.lang.String type = targetDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataTypeElement){
            return new ImplementationDataTypeElementWrapper((ImplementationDataTypeElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}