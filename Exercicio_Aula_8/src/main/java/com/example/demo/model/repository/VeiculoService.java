package com.example.demo.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.utils.CalculadoraDeVeiculos;

import java.util.List;

@Service
public class VeiculoService {
	
	@Autowired
    private VeiculoRepository veiculoRepository;
    
    @Autowired
    private CalculadoraDeVeiculos calc;
    
    public void salvar(Veiculo veiculo) {
    	veiculoRepository.save(veiculo);
        
    }
    
    public List<Veiculo> listarTodos(){
        List<Veiculo>listaVeiculo = veiculoRepository.findAll();
        
        
        for (Veiculo veiculo:listaVeiculo) 
        {
        veiculo.setTech(calc.calculoTech(veiculo.getPotencia(),veiculo.getVelocidade()));
        }
        return listaVeiculo;
    }

}
