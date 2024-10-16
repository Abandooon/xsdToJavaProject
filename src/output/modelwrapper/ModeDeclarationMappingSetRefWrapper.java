package stdgui.data.model.modelwrapper;


    
    


     

public class ModeDeclarationMappingSetRefWrapper {

    
    
    private ModeDeclarationMappingSetRef modeDeclarationMappingSetRef;

    public ModeDeclarationMappingSetRefWrapper(ModeDeclarationMappingSetRef modeDeclarationMappingSetRef) {
        this.modeDeclarationMappingSetRef = modeDeclarationMappingSetRef;
    }

   
    public ModeDeclarationMappingSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSetRef.getDest())) {
            
            return modeDeclarationMappingSetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModeDeclarationMappingSetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = modeDeclarationMappingSetRef.getValue();
        java.lang.String type = modeDeclarationMappingSetRef.getDest().toString().replace("_", "-");
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

    
    public ModeDeclarationMappingSetWrapper getModeDeclarationMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = modeDeclarationMappingSetRef.getValue();
        java.lang.String type = modeDeclarationMappingSetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationMappingSet){
            return new ModeDeclarationMappingSetWrapper((ModeDeclarationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}