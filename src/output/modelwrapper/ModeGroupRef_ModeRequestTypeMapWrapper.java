package stdgui.data.model.modelwrapper;


    
    


     

public class ModeGroupRef_ModeRequestTypeMapWrapper {

    
    
    private ModeGroupRef_ModeRequestTypeMap modeGroupRef_ModeRequestTypeMap;

    public ModeGroupRef_ModeRequestTypeMapWrapper(ModeGroupRef_ModeRequestTypeMap modeGroupRef_ModeRequestTypeMap) {
        this.modeGroupRef_ModeRequestTypeMap = modeGroupRef_ModeRequestTypeMap;
    }

   
    public ModeDeclarationGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(modeGroupRef_ModeRequestTypeMap.getDest())) {
            
            return modeGroupRef_ModeRequestTypeMap.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModeGroupRef_ModeRequestTypeMapObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = modeGroupRef_ModeRequestTypeMap.getValue();
        java.lang.String type = modeGroupRef_ModeRequestTypeMap.getDest().toString().replace("_", "-");
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

    
    public ModeDeclarationGroupWrapper getModeDeclarationGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = modeGroupRef_ModeRequestTypeMap.getValue();
        java.lang.String type = modeGroupRef_ModeRequestTypeMap.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroup){
            return new ModeDeclarationGroupWrapper((ModeDeclarationGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}