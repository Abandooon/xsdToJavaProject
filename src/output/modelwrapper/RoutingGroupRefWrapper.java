package stdgui.data.model.modelwrapper;


    
    


     

public class RoutingGroupRefWrapper {

    
    
    private RoutingGroupRef routingGroupRef;

    public RoutingGroupRefWrapper(RoutingGroupRef routingGroupRef) {
        this.routingGroupRef = routingGroupRef;
    }

   
    public SoAdRoutingGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(routingGroupRef.getDest())) {
            
            return routingGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRoutingGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = routingGroupRef.getValue();
        java.lang.String type = routingGroupRef.getDest().toString().replace("_", "-");
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

    
    public SoAdRoutingGroupWrapper getSoAdRoutingGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = routingGroupRef.getValue();
        java.lang.String type = routingGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SoAdRoutingGroup){
            return new SoAdRoutingGroupWrapper((SoAdRoutingGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}