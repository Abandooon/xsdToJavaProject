package stdgui.data.model.modelwrapper;


    
    


     

public class AssociatedPdurIPduGroupRefWrapper {

    
    
    private AssociatedPdurIPduGroupRef associatedPdurIPduGroupRef;

    public AssociatedPdurIPduGroupRefWrapper(AssociatedPdurIPduGroupRef associatedPdurIPduGroupRef) {
        this.associatedPdurIPduGroupRef = associatedPdurIPduGroupRef;
    }

   
    public PdurIPduGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(associatedPdurIPduGroupRef.getDest())) {
            
            return associatedPdurIPduGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAssociatedPdurIPduGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = associatedPdurIPduGroupRef.getValue();
        java.lang.String type = associatedPdurIPduGroupRef.getDest().toString().replace("_", "-");
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

    
    public PdurIPduGroupWrapper getPdurIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = associatedPdurIPduGroupRef.getValue();
        java.lang.String type = associatedPdurIPduGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PdurIPduGroup){
            return new PdurIPduGroupWrapper((PdurIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}