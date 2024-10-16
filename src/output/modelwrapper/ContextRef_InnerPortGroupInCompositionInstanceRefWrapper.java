package stdgui.data.model.modelwrapper;


    
    


     

public class ContextRef_InnerPortGroupInCompositionInstanceRefWrapper {

    
    
    private ContextRef_InnerPortGroupInCompositionInstanceRef contextRef_InnerPortGroupInCompositionInstanceRef;

    public ContextRef_InnerPortGroupInCompositionInstanceRefWrapper(ContextRef_InnerPortGroupInCompositionInstanceRef contextRef_InnerPortGroupInCompositionInstanceRef) {
        this.contextRef_InnerPortGroupInCompositionInstanceRef = contextRef_InnerPortGroupInCompositionInstanceRef;
    }

   
    public SwComponentPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextRef_InnerPortGroupInCompositionInstanceRef.getDest())) {
            
            return contextRef_InnerPortGroupInCompositionInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextRef_InnerPortGroupInCompositionInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextRef_InnerPortGroupInCompositionInstanceRef.getValue();
        java.lang.String type = contextRef_InnerPortGroupInCompositionInstanceRef.getDest().toString().replace("_", "-");
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

    
    public SwComponentPrototypeWrapper getSwComponentPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextRef_InnerPortGroupInCompositionInstanceRef.getValue();
        java.lang.String type = contextRef_InnerPortGroupInCompositionInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwComponentPrototype){
            return new SwComponentPrototypeWrapper((SwComponentPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}