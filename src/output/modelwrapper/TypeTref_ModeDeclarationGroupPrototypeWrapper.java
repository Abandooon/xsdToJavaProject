package stdgui.data.model.modelwrapper;


    
    


     

public class TypeTref_ModeDeclarationGroupPrototypeWrapper {

    
    
    private TypeTref_ModeDeclarationGroupPrototype typeTref_ModeDeclarationGroupPrototype;

    public TypeTref_ModeDeclarationGroupPrototypeWrapper(TypeTref_ModeDeclarationGroupPrototype typeTref_ModeDeclarationGroupPrototype) {
        this.typeTref_ModeDeclarationGroupPrototype = typeTref_ModeDeclarationGroupPrototype;
    }

   
    public ModeDeclarationGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(typeTref_ModeDeclarationGroupPrototype.getDest())) {
            
            return typeTref_ModeDeclarationGroupPrototype.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTypeTref_ModeDeclarationGroupPrototypeObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = typeTref_ModeDeclarationGroupPrototype.getValue();
        java.lang.String type = typeTref_ModeDeclarationGroupPrototype.getDest().toString().replace("_", "-");
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
        java.lang.String path = typeTref_ModeDeclarationGroupPrototype.getValue();
        java.lang.String type = typeTref_ModeDeclarationGroupPrototype.getDest().toString().replace("_", "-");
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