package stdgui.data.model.modelwrapper;


    
    


     

public class RepresentedPortGroupRefWrapper {

    
    
    private RepresentedPortGroupRef representedPortGroupRef;

    public RepresentedPortGroupRefWrapper(RepresentedPortGroupRef representedPortGroupRef) {
        this.representedPortGroupRef = representedPortGroupRef;
    }

   
    public PortGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(representedPortGroupRef.getDest())) {
            
            return representedPortGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRepresentedPortGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = representedPortGroupRef.getValue();
        java.lang.String type = representedPortGroupRef.getDest().toString().replace("_", "-");
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

    
    public PortGroupWrapper getPortGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = representedPortGroupRef.getValue();
        java.lang.String type = representedPortGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortGroup){
            return new PortGroupWrapper((PortGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}