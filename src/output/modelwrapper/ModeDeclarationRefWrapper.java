package stdgui.data.model.modelwrapper;


    
    


     

public class ModeDeclarationRefWrapper {

    
    
    private ModeDeclarationRef modeDeclarationRef;

    public ModeDeclarationRefWrapper(ModeDeclarationRef modeDeclarationRef) {
        this.modeDeclarationRef = modeDeclarationRef;
    }

   
    public ModeDeclarationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(modeDeclarationRef.getDest())) {
            
            return modeDeclarationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModeDeclarationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = modeDeclarationRef.getValue();
        java.lang.String type = modeDeclarationRef.getDest().toString().replace("_", "-");
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

    
    public ModeDeclarationWrapper getModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = modeDeclarationRef.getValue();
        java.lang.String type = modeDeclarationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclaration){
            return new ModeDeclarationWrapper((ModeDeclaration) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}