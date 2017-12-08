
package za.ac.nwu.wsdl.studentacademicregistration;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentAcademicRegistrationService", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentAcademicRegistrationService {


    /**
     * 
     * @param contextInfo
     * @param moduleOfferingSearchCriteriaInfo
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws MissingParameterException
     * @throws InvalidParameterException
     * @throws DoesNotExistException
     * @throws PermissionDeniedException
     * @throws OperationFailedException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentAcademicRegistrationByModuleOffering", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByModuleOffering")
    @ResponseWrapper(localName = "getStudentAcademicRegistrationByModuleOfferingResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByModuleOfferingResponse")
    public List<String> getStudentAcademicRegistrationByModuleOffering(
        @WebParam(name = "moduleOfferingSearchCriteriaInfo", targetNamespace = "")
        ModuleOfferingSearchCriteriaInfo moduleOfferingSearchCriteriaInfo,
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

}