package stdgui.data.model.modelwrapper;


    
    


     

public class PredecessorActionRefWrapper {

    
    
    private PredecessorActionRef predecessorActionRef;

    public PredecessorActionRefWrapper(PredecessorActionRef predecessorActionRef) {
        this.predecessorActionRef = predecessorActionRef;
    }

   
    public BuildActionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(predecessorActionRef.getDest())) {
            
            return predecessorActionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPredecessorActionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = predecessorActionRef.getValue();
        java.lang.String type = predecessorActionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = predecessorActionRef.getValue();
        java.lang.String type = predecessorActionRef.getDest().toString().replace("_", "-");
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