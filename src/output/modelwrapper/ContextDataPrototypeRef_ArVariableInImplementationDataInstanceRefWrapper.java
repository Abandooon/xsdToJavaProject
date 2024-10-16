package stdgui.data.model.modelwrapper;


    
    


     

public class ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper {

    
    
    private ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef;

    public ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper(ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef) {
        this.contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef = contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef;
    }

   
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest())) {
            
            return contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getValue();
        java.lang.String type = contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getValue();
        java.lang.String type = contextDataPrototypeRef_ArVariableInImplementationDataInstanceRef.getDest().toString().replace("_", "-");
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