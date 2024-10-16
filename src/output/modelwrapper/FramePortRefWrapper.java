package stdgui.data.model.modelwrapper;


    
    


     

public class FramePortRefWrapper {

    
    
    private FramePortRef framePortRef;

    public FramePortRefWrapper(FramePortRef framePortRef) {
        this.framePortRef = framePortRef;
    }

   
    public FramePortSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(framePortRef.getDest())) {
            
            return framePortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFramePortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = framePortRef.getValue();
        java.lang.String type = framePortRef.getDest().toString().replace("_", "-");
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

    
    public FramePortWrapper getFramePort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = framePortRef.getValue();
        java.lang.String type = framePortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FramePort){
            return new FramePortWrapper((FramePort) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}