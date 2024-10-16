package stdgui.data.model.modelwrapper;


    
    


     

public class ModeDeclarationGroupRefWrapper {

    
    
    private ModeDeclarationGroupRef modeDeclarationGroupRef;

    public ModeDeclarationGroupRefWrapper(ModeDeclarationGroupRef modeDeclarationGroupRef) {
        this.modeDeclarationGroupRef = modeDeclarationGroupRef;
    }

   
    public ModeDeclarationGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupRef.getDest())) {
            
            return modeDeclarationGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModeDeclarationGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = modeDeclarationGroupRef.getValue();
        java.lang.String type = modeDeclarationGroupRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = modeDeclarationGroupRef.getValue();
        java.lang.String type = modeDeclarationGroupRef.getDest().toString().replace("_", "-");
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