package stdgui.data.model.modelwrapper;


    
    


     

public class DynamicActionRefWrapper {

    
    
    private DynamicActionRef dynamicActionRef;

    public DynamicActionRefWrapper(DynamicActionRef dynamicActionRef) {
        this.dynamicActionRef = dynamicActionRef;
    }

   
    public BuildActionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dynamicActionRef.getDest())) {
            
            return dynamicActionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDynamicActionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dynamicActionRef.getValue();
        java.lang.String type = dynamicActionRef.getDest().toString().replace("_", "-");
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

    
    public BuildActionWrapper getBuildAction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dynamicActionRef.getValue();
        java.lang.String type = dynamicActionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildAction){
            return new BuildActionWrapper((BuildAction) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}