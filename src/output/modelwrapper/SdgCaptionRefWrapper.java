package stdgui.data.model.modelwrapper;


    
    


     

public class SdgCaptionRefWrapper {

    
    
    private SdgCaptionRef sdgCaptionRef;

    public SdgCaptionRefWrapper(SdgCaptionRef sdgCaptionRef) {
        this.sdgCaptionRef = sdgCaptionRef;
    }

   
    public SdgCaptionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sdgCaptionRef.getDest())) {
            
            return sdgCaptionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSdgCaptionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sdgCaptionRef.getValue();
        java.lang.String type = sdgCaptionRef.getDest().toString().replace("_", "-");
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

    
    public SdgCaptionWrapper getSdgCaption() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sdgCaptionRef.getValue();
        java.lang.String type = sdgCaptionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SdgCaption){
            return new SdgCaptionWrapper((SdgCaption) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}