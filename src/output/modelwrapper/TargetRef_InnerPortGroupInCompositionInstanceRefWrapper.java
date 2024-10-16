package stdgui.data.model.modelwrapper;


    
    


     

public class TargetRef_InnerPortGroupInCompositionInstanceRefWrapper {

    
    
    private TargetRef_InnerPortGroupInCompositionInstanceRef targetRef_InnerPortGroupInCompositionInstanceRef;

    public TargetRef_InnerPortGroupInCompositionInstanceRefWrapper(TargetRef_InnerPortGroupInCompositionInstanceRef targetRef_InnerPortGroupInCompositionInstanceRef) {
        this.targetRef_InnerPortGroupInCompositionInstanceRef = targetRef_InnerPortGroupInCompositionInstanceRef;
    }

   
    public PortGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRef_InnerPortGroupInCompositionInstanceRef.getDest())) {
            
            return targetRef_InnerPortGroupInCompositionInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRef_InnerPortGroupInCompositionInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRef_InnerPortGroupInCompositionInstanceRef.getValue();
        java.lang.String type = targetRef_InnerPortGroupInCompositionInstanceRef.getDest().toString().replace("_", "-");
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

    
    public PortGroupWrapper getPortGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef_InnerPortGroupInCompositionInstanceRef.getValue();
        java.lang.String type = targetRef_InnerPortGroupInCompositionInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortGroup){
            return new PortGroupWrapper((PortGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}