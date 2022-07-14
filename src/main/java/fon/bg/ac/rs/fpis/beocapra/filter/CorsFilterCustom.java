package fon.bg.ac.rs.fpis.beocapra.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@Component
public class CorsFilterCustom implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        ((HttpServletResponse) res).setHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse) res).setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        ((HttpServletResponse) res).setHeader("Access-Control-Max-Age", "3600");
        ((HttpServletResponse) res).setHeader("Access-Control-Allow-Headers", "*");
        chain.doFilter(req, res);
    }

}