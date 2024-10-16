package stdgui.data.model.modelwrapper;


    
    


     

public class SubstitutedFrameRefWrapper {

    
    
    private SubstitutedFrameRef substitutedFrameRef;

    public SubstitutedFrameRefWrapper(SubstitutedFrameRef substitutedFrameRef) {
        this.substitutedFrameRef = substitutedFrameRef;
    }

   
    public LinUnconditionalFrameSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(substitutedFrameRef.getDest())) {
            
            return substitutedFrameRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSubstitutedFrameRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = substitutedFrameRef.getValue();
        java.lang.String type = substitutedFrameRef.getDest().toString().replace("_", "-");
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

    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = substitutedFrameRef.getValue();
        java.lang.String type = substitutedFrameRef.getDest().toString().replace("_", "-");
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