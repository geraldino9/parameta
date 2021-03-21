package co.parameta.empleado.coparametaservicioempleado.controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import static java.time.temporal.ChronoUnit.*;
import java.text.ParseException;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.parameta.empleado.coparametaservicioempleado.model.entity.EmpleadoRest;
import co.parameta.interfaces.EmpleadoInterface;
import co.parameta.servicios.EmpleadoServiceImplPortBindingStub;
import co.parameta.servicios.EmpleadoServiceImplService;
import co.parameta.servicios.EmpleadoServiceImplServiceLocator;



@RestController
public class EmpleadoController {




    @Value("${server.port}")
    private Integer port;

    @GetMapping("/agregar")
//    @RequestMapping(method = RequestMethod.GET)
    public EmpleadoRest agregar(@RequestBody @Validated EmpleadoRest empleado) {
        String data = "retorno lo agregado";
        System.out.println("Se esta ejecutando el agregar");
        Calendar cal = Calendar.getInstance();
        try {
        	EmpleadoServiceImplService servicio = new EmpleadoServiceImplServiceLocator();
        	EmpleadoInterface ws = new EmpleadoServiceImplPortBindingStub(new URL(servicio.getEmpleadoServiceImplPortAddress()), servicio);
        	
        	co.parameta.interfaces.Empleado empleado_arg = new co.parameta.interfaces.Empleado();    	
        	empleado_arg.setApellidos(empleado.getApellidos());		
        	empleado_arg.setCargo(empleado.getCargo());
        	cal.setTime( ParseFecha( empleado.getFechaNacimiento() ) );
        	empleado_arg.setFechaNacimiento( cal );    
        	cal.setTime( ParseFecha( empleado.getFechaVinculacionCompania() ) );
        	empleado_arg.setFechaVinculacionCompania( cal );
        	empleado_arg.setNombres(empleado.getNombres());
        	empleado_arg.setNumeroDocumento(empleado.getNumeroDocumento());
        	empleado_arg.setOk(false);
        	empleado_arg.setSalario(empleado.getSalario());
        	empleado_arg.setTipoDocumento(empleado.getTipoDocumento());    
        	
        	
        	ws.create(empleado_arg);
        	empleado.setId(empleado_arg.getId());
        	
        	empleado.setEdadActual( diferenciaFechas( empleado.getFechaNacimiento() ) );
        	empleado.setTiempoVinculacion( diferenciaFechas( empleado.getFechaVinculacionCompania() ) );
        		
        	
        	
        } catch (Exception e) {
         e.printStackTrace();

        }

        return empleado;
    }
    
    /**
     * 
     * @param fecha
     * @return
     */
    public String diferenciaFechas(String fecha) {
    	String data = "";
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ChronoLocalDate from = ChronoLocalDate.from(formatter.parse(fecha));
        ChronoLocalDate to = ChronoLocalDate.from(formatter.parse("2021-03-20"));
        ChronoPeriod period = ChronoPeriod.between(from, to);
    	return period.get(YEARS)+" años, "+period.get(MONTHS)+" meses y "+period.get(DAYS)+" días";
    }
    
    /**
     * 
     * @param fecha
     * @return
     */
    public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
