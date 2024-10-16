package stdgui.data.model.modelwrapper;


    
    


     

public class PredecessorFifoRefWrapper {

    
    
    private PredecessorFifoRef predecessorFifoRef;

    public PredecessorFifoRefWrapper(PredecessorFifoRef predecessorFifoRef) {
        this.predecessorFifoRef = predecessorFifoRef;
    }

   
    public CouplingPortFifoSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(predecessorFifoRef.getDest())) {
            
            return predecessorFifoRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPredecessorFifoRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = predecessorFifoRef.getValue();
        java.lang.String type = predecessorFifoRef.getDest().toString().replace("_", "-");
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

    
    public CouplingPortFifoWrapper getCouplingPortFifo() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = predecessorFifoRef.getValue();
        java.lang.String type = predecessorFifoRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortFifo){
            return new CouplingPortFifoWrapper((CouplingPortFifo) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}