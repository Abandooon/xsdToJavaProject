package stdgui.data.model.modelwrapper;


    
    


     

public class ConsumedEventGroupRefWrapper {

    
    
    private ConsumedEventGroupRef consumedEventGroupRef;

    public ConsumedEventGroupRefWrapper(ConsumedEventGroupRef consumedEventGroupRef) {
        this.consumedEventGroupRef = consumedEventGroupRef;
    }

   
    public ConsumedEventGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(consumedEventGroupRef.getDest())) {
            
            return consumedEventGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConsumedEventGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = consumedEventGroupRef.getValue();
        java.lang.String type = consumedEventGroupRef.getDest().toString().replace("_", "-");
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

    
    public ConsumedEventGroupWrapper getConsumedEventGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = consumedEventGroupRef.getValue();
        java.lang.String type = consumedEventGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsumedEventGroup){
            return new ConsumedEventGroupWrapper((ConsumedEventGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}