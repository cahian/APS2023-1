package com.unip.aps.controller;

import com.unip.aps.model.ONG;

import java.util.ArrayList;
import java.util.List;

public class ONGController {
    private static final String ONGSBRASIL_URL = "https://www.ongsbrasil.com.br/default.asp";

    public ONGController() {
    }

    public List<ONG> buscarOngsProximas(String name, String address) {
        // Aqui você pode implementar a lógica para buscar ONGs com base nas informações fornecidas.
        // Você pode usar APIs de geolocalização, bancos de dados ou outras fontes de dados.

        List<ONG> ongs = new ArrayList<>();
        ongs.add(new ONG("Instituto Ser Mais",  "O Instituto Ser Mais é uma organização sem fins lucrativos que promove a empregabilidade por meio de cursos de capacitação profissional, programas de mentoria e encaminhamento para oportunidades de trabalho.", "contato@institutosermais.org", "(11) 1234-5678", "1234567890001-01", "Rua Exemplo, 123, Cidade, Estado"));
        ongs.add(new ONG("Rede Cidadã",  "A Rede Cidadã atua na promoção da empregabilidade por meio de cursos, oficinas e programas de inclusão social, visando capacitar e inserir jovens e adultos no mercado de trabalho.", "contato@redecidada.org.br", "(11) 2345-6789", "234567890001-02", "Avenida Exemplo, 456, Cidade, Estado"));
        ongs.add(new ONG("Gerando Falcões",  "O Gerando Falcões é uma organização que busca transformar comunidades por meio da educação e empregabilidade. Oferece cursos profissionalizantes, orientação vocacional e auxílio na busca por oportunidades de trabalho.", "contato@gerandofalcoes.com", "(11) 3456-7890", "345678900001-03", "Travessa Exemplo, 789, Cidade, Estado"));
        ongs.add(new ONG("Centro de Integração Empresa-Escola (CIEE)",  "O CIEE tem como objetivo promover a integração entre estudantes e o mercado de trabalho, oferecendo programas de estágio, aprendizagem, orientação profissional e capacitação para jovens e adolescentes.", "contato@ciee.org.br", "(11) 4567-8901", "456789010001-04", "Rua Principal, 987, Cidade, Estado"));
        ongs.add(new ONG("Instituto da Oportunidade Social (IOS)",  "O Instituto da Oportunidade Social oferece cursos gratuitos de capacitação profissional nas áreas de tecnologia, preparando jovens para o mercado de trabalho por meio de parcerias com empresas e instituições.", "contato@ios.org.br", "(11) 5678-9012", "567890120001-05", "Avenida Principal, 654, Cidade, Estado"));
        ongs.add(new ONG("Fundação Projeto Pescar",  "A Fundação Projeto Pescar promove a inclusão social e a empregabilidade de jovens por meio de cursos de formação profissional, preparando-os para o mercado de trabalho e estimulando o empreendedorismo.", "contato@projetopescar.org.br", "(11) 6789-0123", "678901230001-06", "Rua Modelo, 321, Cidade, Estado"));
        ongs.add(new ONG("Instituto Eidos",  "O Instituto Eidos promove a formação profissional e pessoal de jovens em situação de vulnerabilidade, oferecendo cursos e programas de capacitação, visando o desenvolvimento de habilidades e a inserção no mercado de trabalho.", "contato@institutoeidos.org.br", "(11) 7890-1234", "789012340001-07", "Avenida Modelo, 123, Cidade, Estado"));
        ongs.add(new ONG("Instituto da Criança",  "O Instituto da Criança atua na capacitação e inclusão social de jovens e adolescentes em situação de vulnerabilidade, por meio de programas de educação, formação profissional e apoio na busca por oportunidades de trabalho.", "contato@institutodacrianca.org.br", "(11) 8901-2345", "890123450001-08", "Rua Teste, 987, Cidade, Estado"));
        ongs.add(new ONG("Associação Saúde Criança",  "A Associação Saúde Criança busca a promoção da empregabilidade de famílias em situação de vulnerabilidade por meio de programas de capacitação, acompanhamento social e inserção no mercado de trabalho.", "contato@saudecrianca.org.br", "(11) 9012-3456", "901234560001-09", "Avenida Teste, 876, Cidade, Estado"));
        ongs.add(new ONG("Instituto Reciclar",  "O Instituto Reciclar promove a inclusão social e a empregabilidade por meio da capacitação profissional de jovens em situação de vulnerabilidade, com foco em áreas relacionadas à reciclagem e sustentabilidade.", "contato@institutoreciclar.org.br", "(11) 0123-4567", "012345670001-10", "Rua Exemplo, 654, Cidade, Estado"));
        ongs.add(new ONG("Instituto Ayrton Senna",  "Promove a educação de qualidade, contribuindo para a formação integral de crianças e jovens.", "contato@ias.org.br", "(11) 3076-7500", "01.614.969/0001-28", "Av. Prof. Ascendino Reis, 455 - Vila Clementino, São Paulo/SP"));
        ongs.add(new ONG("Cidadão Pró-Mundo",  "Oferece cursos e oportunidades de trabalho para jovens em situação de vulnerabilidade.", "contato@cidadaopromundo.org.br", "(11) 3892-6462", "02.528.456/0001-40", "Rua Alves Guimarães, 429 - Pinheiros, São Paulo/SP"));
        ongs.add(new ONG("Projeto Arrastão",  "Atua no desenvolvimento de comunidades por meio da educação, cultura e empregabilidade.", "contato@arrastao.org.br", "(11) 3874-4380", "44.284.220/0001-20", "Rua Dr. James Ferraz Alvim, 56 - Butantã, São Paulo/SP"));
        ongs.add(new ONG("ONG Moradia e Cidadania",  "Promove ações sociais visando à melhoria das condições de vida de comunidades carentes.", "ong@moradiaecidadania.org.br", "(61) 3321-2626", "01.929.389/0001-07", "SCS Quadra 06, Bloco A, Lote 32, Sala 202 - Ed. Bandeirantes, Brasília/DF"));
        ongs.add(new ONG("Instituto Souza Cruz",  "Investe em projetos sociais nas áreas de educação, geração de trabalho e renda.", "contato@institutosouzacruz.org.br", "(21) 3299-7400", "42.304.866/0001-93", "Av. Borges de Medeiros, 2.777 - Lagoa, Rio de Janeiro/RJ"));
        ongs.add(new ONG("Rede Asta",  "Capacita artesãs para a produção de produtos sustentáveis e geração de renda.", "contato@redeasta.com.br", "(21) 3435-8672", "06.294.875/0001-84", "Rua Real Grandeza, 312 - Botafogo, Rio de Janeiro/RJ"));
        ongs.add(new ONG("Fundação Vale",  "Desenvolve projetos nas áreas de educação, saúde e geração de trabalho e renda.", "fundacaovale@vale.com", "(21) 3485-5000", "33.096.325/0001-40", "Av. Graça Aranha, 26 - 9º andar - Centro, Rio de Janeiro/RJ"));
        ongs.add(new ONG("Junior Achievement Brasil",  "Estimula o empreendedorismo e a educação financeira em jovens estudantes.", "jabrasil@jabrasil.org.br", "(11) 3372-3844", "61.454.673/0001-15", "Av. Horácio Lafer, 145 - Itaim Bibi, São Paulo/SP"));
        ongs.add(new ONG("Instituto Elos",  "Promove o desenvolvimento de comunidades por meio de ações colaborativas.", "contato@institutoelos.org", "(13) 3481-2020", "02.972.103/0001-75", "Rua Jacob Luchesi Júnior, 48 - Centro, Santos/SP"));
        ongs.add(new ONG("Crescer Sempre",  "Oferece capacitação e oportunidades de trabalho para jovens em vulnerabilidade social.", "contato@crescersempre.org.br", "(11) 3242-3601", "00.503.052/0001-02", "Rua Aurora, 340 - Santa Efigênia, São Paulo/SP"));
        ongs.add(new ONG("Ashoka",  "A Ashoka é uma organização global que apoia empreendedores sociais de alto impacto em todo o mundo.", "contato@ashoka.org.br", "+55 11 3082-3103", "00.000.000/0001-00", "Rua Doutor Renato Paes de Barros, 817 - 10º andar, Itaim Bibi, São Paulo - SP"));
        ongs.add(new ONG("Aliança Empreendedora",  "A Aliança Empreendedora promove o empreendedorismo como alternativa de geração de trabalho e renda para pessoas em situação de vulnerabilidade social.", "contato@aliancaempreendedora.org.br", "+55 48 3025-0909", "00.000.000/0001-00", "Rua General Liberato Bittencourt, 44 - Sala 202, Trindade, Florianópolis - SC"));
        ongs.add(new ONG("ONG Rede Mulher Empreendedora",  "A Rede Mulher Empreendedora apoia mulheres empreendedoras, oferecendo capacitação, mentorias e suporte para o desenvolvimento de seus negócios.", "contato@redemulherempreendedora.com.br", "+55 11 98230-2670", "00.000.000/0001-00", "Rua da Consolação, 3592 - Conjunto 21, Cerqueira César, São Paulo - SP"));
        ongs.add(new ONG("Centro de Voluntariado de São Paulo",  "O Centro de Voluntariado de São Paulo promove ações voluntárias e estimula a cultura do voluntariado na sociedade.", "contato@voluntariado.org.br", "+55 11 3814-7232", "00.000.000/0001-00", "Rua Galeno de Almeida, 557 - 1º andar, Pinheiros, São Paulo - SP"));
        ongs.add(new ONG("Programa Ação pela Paz",  "O Programa Ação pela Paz busca promover a paz e a inclusão social por meio de projetos e iniciativas que estimulam a empregabilidade e a educação.", "contato@acaopelapaz.org.br", "+55 31 3304-0490", "00.000.000/0001-00", "Rua Manaus, 222 - Santa Efigênia, Belo Horizonte - MG"));
        ongs.add(new ONG("Rede Conhecimento Social",  "A Rede Conhecimento Social promove o desenvolvimento social e a empregabilidade por meio de projetos, capacitações e parcerias com organizações sociais.", "contato@redesocial-sp.org.br", "+55 11 3230-8506", "00.000.000/0001-00", "Rua Bela Cintra, 409 - 6º andar, Consolação, São Paulo - SP"));
        ongs.add(new ONG("Instituto ProA",  "O Instituto ProA oferece programas de capacitação profissional e inserção no mercado de trabalho para jovens em situação de vulnerabilidade.", "contato@institutoproa.org.br", "+55 11 2385-7500", "00.000.000/0001-00", "Rua da Consolação, 3791 - Cerqueira César, São Paulo - SP"));
        ongs.add(new ONG("Instituto Jatobás",  "O Instituto Jatobás promove ações e projetos socioambientais, estimulando o empreendedorismo e a geração de empregos verdes.", "contato@jatobas.org.br", "+55 11 3034-2023", "00.000.000/0001-00", "Rua Cláudio Soares, 72 - 6º andar, Pinheiros, São Paulo - SP"));
        ongs.add(new ONG("ONG Comunitas",  "A ONG Comunitas atua no desenvolvimento de projetos sociais e de empregabilidade em parceria com o setor público e privado.", "contato@comunitas.org", "+55 11 3038-1492", "00.000.000/0001-00", "Rua Funchal, 411 - 6º andar, Vila Olímpia, São Paulo - SP"));
        ongs.add(new ONG("Aliança de Misericórdia",  "A Aliança de Misericórdia promove a inclusão social e a geração de empregos por meio de projetos de formação e capacitação profissional.", "contato@aliancademisericordia.org.br", "+55 11 3813-2821", "00.000.000/0001-00", "Rua Conselheiro Carrão, 638 - Bela Vista, São Paulo - SP"));

        return ongs;
    }
}
