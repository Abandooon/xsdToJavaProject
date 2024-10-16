package stdgui.data.model.modelwrapper;


    
    


     

public class FollowUpActionRefWrapper {

    
    
    private FollowUpActionRef followUpActionRef;

    public FollowUpActionRefWrapper(FollowUpActionRef followUpActionRef) {
        this.followUpActionRef = followUpActionRef;
    }

   
    public BuildActionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(followUpActionRef.getDest())) {
            
            return followUpActionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFollowUpActionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = followUpActionRef.getValue();
        java.lang.String type = followUpActionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = followUpActionRef.getValue();
        java.lang.String type = followUpActionRef.getDest().toString().replace("_", "-");
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