package stdgui.data.model.modelwrapper;


    
    


     

public class SoftwareCompositionTrefWrapper {

    
    
    private SoftwareCompositionTref softwareCompositionTref;

    public SoftwareCompositionTrefWrapper(SoftwareCompositionTref softwareCompositionTref) {
        this.softwareCompositionTref = softwareCompositionTref;
    }

   
    public CompositionSwComponentTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(softwareCompositionTref.getDest())) {
            
            return softwareCompositionTref.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSoftwareCompositionTrefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = softwareCompositionTref.getValue();
        java.lang.String type = softwareCompositionTref.getDest().toString().replace("_", "-");
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

    
    public CompositionSwComponentTypeWrapper getCompositionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = softwareCompositionTref.getValue();
        java.lang.String type = softwareCompositionTref.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompositionSwComponentType){
            return new CompositionSwComponentTypeWrapper((CompositionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}