package stdgui.data.model.modelwrapper;


    
    


     

public class ModeDeclarationRef_TdEventBswModeDeclarationWrapper {

    
    
    private ModeDeclarationRef_TdEventBswModeDeclaration modeDeclarationRef_TdEventBswModeDeclaration;

    public ModeDeclarationRef_TdEventBswModeDeclarationWrapper(ModeDeclarationRef_TdEventBswModeDeclaration modeDeclarationRef_TdEventBswModeDeclaration) {
        this.modeDeclarationRef_TdEventBswModeDeclaration = modeDeclarationRef_TdEventBswModeDeclaration;
    }

   
    public ModeDeclarationGroupPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(modeDeclarationRef_TdEventBswModeDeclaration.getDest())) {
            
            return modeDeclarationRef_TdEventBswModeDeclaration.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModeDeclarationRef_TdEventBswModeDeclarationObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = modeDeclarationRef_TdEventBswModeDeclaration.getValue();
        java.lang.String type = modeDeclarationRef_TdEventBswModeDeclaration.getDest().toString().replace("_", "-");
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

    
    public ModeDeclarationGroupPrototypeWrapper getModeDeclarationGroupPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = modeDeclarationRef_TdEventBswModeDeclaration.getValue();
        java.lang.String type = modeDeclarationRef_TdEventBswModeDeclaration.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroupPrototype){
            return new ModeDeclarationGroupPrototypeWrapper((ModeDeclarationGroupPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}