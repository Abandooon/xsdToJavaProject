package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class FrameRef_LinConfigurableFrameWrapper {

    
    
    private FrameRef_LinConfigurableFrame frameRef_LinConfigurableFrame;

    public FrameRef_LinConfigurableFrameWrapper(FrameRef_LinConfigurableFrame frameRef_LinConfigurableFrame) {
        this.frameRef_LinConfigurableFrame = frameRef_LinConfigurableFrame;
    }

   
    public LinFrameSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(frameRef_LinConfigurableFrame.getDest())) {
            
            return frameRef_LinConfigurableFrame.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFrameRef_LinConfigurableFrameObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = frameRef_LinConfigurableFrame.getValue();
        java.lang.String type = frameRef_LinConfigurableFrame.getDest().toString().replace("_", "-");
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

    
    public LinEventTriggeredFrameWrapper getLinEventTriggeredFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef_LinConfigurableFrame.getValue();
        java.lang.String type = frameRef_LinConfigurableFrame.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinEventTriggeredFrame){
            return new LinEventTriggeredFrameWrapper((LinEventTriggeredFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSporadicFrameWrapper getLinSporadicFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef_LinConfigurableFrame.getValue();
        java.lang.String type = frameRef_LinConfigurableFrame.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSporadicFrame){
            return new LinSporadicFrameWrapper((LinSporadicFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameRef_LinConfigurableFrame.getValue();
        java.lang.String type = frameRef_LinConfigurableFrame.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinUnconditionalFrame){
            return new LinUnconditionalFrameWrapper((LinUnconditionalFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}