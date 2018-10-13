package manzilin.lesson.simple_study;

import java.util.HashMap;

public class Column {
    private static final int[] Param = new int[100];
    String KEY;
    String[] base1;
    String[] base2;
    static HashMap Mass = new HashMap();
    HashMap Optimum;

    static {
        int nk; // = tonumber(tbl.potok[9])
        int vk; // = tonumber(tbl.potok[10])
        HashMap<String, Object> Mass = new HashMap<>();
        Mass.put("g", 9.80665);
        Float[] floats = {0.0f, 0.0f};
        Mass.put("Vm", floats);
        /**
         * применение таким образом массива некорректно
         */
        Mass.put("Q", floats);
        Mass.put("sigm", floats);
        Mass.put("h", floats);
        Mass.put("G", floats);
        Mass.put("K", floats);
        Mass.put("PA", floats);
        Mass.put("PB", floats);
        Mass.put("alpha", floats);
        Mass.put("Tr", floats);
        Mass.put("Fr", floats);
        Mass.put("Fi", floats);
        Mass.put("Ro", floats);
        Mass.put("epsil", floats);
        Mass.put("MjU", floats);
        Mass.put("Vkip", floats);
        Mass.put("MjUp", floats);
        HashMap Mass_prop = new HashMap();
        Mass.put("prop", Mass_prop);
        Mass_prop.put("eta", floats);
        Mass_prop.put("eta1", floats);
        Mass_prop.put("Rk", floats);
        Mass_prop.put("rk1", floats);
        Mass_prop.put("v0", floats);
        Mass_prop.put("d0", floats);
        Mass_prop.put("hp", floats);
        Mass.put("const_plast", 0.058);
        // константа коэффициента поверхностного трения пластины, для канала равна 0.079
    }

//

    public Column(String KEY, String[] base1, String[] base2, HashMap mass) {
        this.KEY = KEY;
        this.base1 = base1;
        this.base2 = base2;
        Mass.putAll(mass);
    }

    public HashMap compute(String KEY) {
        column1();
        column2(KEY);
        for (String key1 : base2) {
            for (int num_plate_in_type : Param) {
                zapros_plate(key1, num_plate_in_type);
                column3(KEY, key1, num_plate_in_type);
            }
        }
        return Optimum;
        //        column1()
//        column2(KEY)
//        for key in pairs (base2) do
//        for num_plate_in_type, value in ipairs (base2[key].Param) do
//        zapros_plate(key, num_plate_in_type)
//        column3(KEY, key, num_plate_in_type)
//        end
//        end
//
//        return Optimum
//        end
    }

    private void zapros_plate(String key1, int num_plate_in_type) {
    }

    private void column1() {

    }

    private void column2(String KEY) {

    }

    private void column3(String KEY, String key, int num_plate_in_type) {

    }


}
//    function column (KEY, tbl,  base1, base2)
//    local Mass = {}
//    local Optimum = {}
//    local nk, vk = tonumber(tbl.potok[9]),tonumber(tbl.potok[10])
//        -- Для констант
//        Mass.g = 9.80665
//        Mass.Vm = {}
//        Mass.Q, Mass.sigm ={}, {}
//        Mass.h, Mass.G, Mass.K = {},{},{}
//        Mass.PA, Mass.PB, Mass.alpha = {}, {}, {}
//        Mass.Tr, Mass.Fr, Mass.Fi, Mass.Ro, Mass.epsil, Mass.MjU, Mass.Vkip, Mass.MjUp = {}, {}, {}, {}, {}, {}, {}, {}
//        Mass.prop={}
//        Mass.prop.eta, Mass.prop.eta1, Mass.prop.Rk, Mass.prop.rkl, Mass.prop.w0, Mass.prop.d0, Mass.prop.hp  = 0, 0, 0, 0, 0, 0, 0
//        Mass.const_plast = 0.058  -- константа для коэффициента поверхностного трения пластины
//        -- для канала равна 0.079
//        -- Длинные вычисления
//        function Pressure_vapor(t, key)     -- Определение давления насыщенных паров ур_Риделя-Планка-Мюллера
//        Mass.h[key]=(Mass.Tb[key]/Mass.Tc[key])*(math.log(Mass.Pc[key])/(1-Mass.Tb[key]/Mass.Tc[key]))
//        Mass.G[key]=(0.4835+0.4605*Mass.h[key])
//        Mass.K[key]=(Mass.h[key]/Mass.G[key]-(1+Mass.Tb[key]/Mass.Tc[key]))/((3+Mass.Tb[key]/Mass.Tc[key])*(1-Mass.Tb[key]/Mass.Tc[key])^2)
//        return Mass.Pc[key]*math.exp(-Mass.G[key]/(t/Mass.Tc[key])*(1-(t/Mass.Tc[key])^2+Mass.K[key]*(3+t/Mass.Tc[key])*(1-t/Mass.Tc[key])^3))
//        end
//        --
//        function BETA(Udin,ro, R1, Sc)     --         коэффициента массоотдачи
//        return (Udin*(Mass.S0*((1/2)*Mass.roP*Mass.w0^2+Mass.g*Mass.roz*Mass.hst)-(1/2)*Mass.Sk*Mass.roP*Mass.wk^2)/(math.atan(math.sqrt(R1*Sc))*math.sqrt(R1)*(Udin^2*ro+2*Mass.sigma/(.5*Mass.d0))))
//        end
//
//        function sigma_pure(key,temp)      --         коэффициента поверхностного натяжения
//        local Tbr = Mass.Tb[key]/Mass.Tc[key]
//        Mass.Q[key] = 0.1207 * (1+ Tbr*math.log(Mass.Pc[key])/(1-Tbr)) - 0.281
//        Mass.sigm[key] = Mass.Pc[key]^(2/3)*Mass.Tc[key]^(1/3)*Mass.Q[key]*(1-temp/Mass.Tc[key])^(11/9)*10^(2)
//        -- дин/см  из базы в в дин/м
//        end
//
//
//        function zapros_plate (key, num_plate_in_type )
//        Mass.N = base2[key].Info.PotokN; -- число потоков на тарелке
//        Mass.n = base2[key].Param[num_plate_in_type].n/Mass.N; -- число клапанов делится на потоки, предподсчет возможно сделать
//        Mass.Lper = base2[key].Param[num_plate_in_type].Lper; --_длина перегородки  или периметр слива --
//        Mass.fc = base2[key].Param[num_plate_in_type].f_otn; --относительное свободное сечение тарелки
//        Mass.Rk = base2[key].Param[num_plate_in_type].Dk/2; -- радиус колонны
//        --Mass.b_plate= 3/2*Mass.fc*math.pi*Mass.Rk^2/Mass.Lper --(предрасчет нужен)
//        Mass.b_plate= 3/2*0.1*math.pi*Mass.Rk^2/Mass.Lper --(предрасчет нужен)
//        Mass.Lzid=(base2[key].Param[num_plate_in_type].Dk-2*Mass.b_plate)/Mass.N-- длина пути жидкости -- надо ли делить на потоки в базе, сделать предрасчет
//        Mass.Srab = base2[key].Param[num_plate_in_type].Srab/Mass.N; --  рабочее сечение
//        Mass.bsr = Mass.Srab/Mass.Lzid; -- Ширина тарелки (предрасчет нужен)
//        Mass.Sk = base2[key].Param[num_plate_in_type].Sk/Mass.N;   --свободное сечение колонны
//        Mass.S0 = base2[key].Param[num_plate_in_type].S0;  --свободное сечение тарелки
//        end
//
//        function column1 ()
//
//
//        -- Входные параметры,
//        Mass.Tup=tonumber(tbl.potok[11])+273.15 -- перевод в Кельвин, значит запрашивать градусы.
//        Mass.Tdn=tonumber(tbl.potok[12])+273.15
//        Mass.Xd_nk_m=tonumber(tbl.potok[13] )
//        Mass.Xw_nk_m=tonumber(tbl.potok[14] )
//        Mass.G_potok1=tonumber(tbl.potok[1])*tonumber(tbl.potok[8])/100         ;-- Входные параметрЫ,
//        Mass.G_potok2_nk=tonumber(tbl.potok[2])*tonumber(tbl.potok[8])/100
//        Mass.G_potok3_vk=tonumber(tbl.potok[3])*tonumber(tbl.potok[8])/100
//        Mass.G_potok4=tonumber(tbl.potok[4])*tonumber(tbl.potok[8])/100
//        Mass.G_potok5=tonumber(tbl.potok[5])*tonumber(tbl.potok[8])/100
//        Mass.G_potok6=tonumber(tbl.potok[6])*tonumber(tbl.potok[8])/100
//        Mass.G_potok7=tonumber(tbl.potok[7])*tonumber(tbl.potok[8])/100
//        Mass.Gf=Mass.G_potok1+Mass.G_potok2_nk+Mass.G_potok3_vk+Mass.G_potok4+Mass.G_potok5+Mass.G_potok6+Mass.G_potok7
//        -- метод Тина и Калуса
//        Mass.Vm.nk = (base1[nk].VM) or 0.285*base1[nk].VC^(1.048)
//        Mass.Vm.vk = (base1[vk].VM) or 0.285*base1[vk].VC^(1.048)
//        Mass.Xf_nk_m=(Mass.G_potok1+Mass.G_potok2_nk)/Mass.Gf
//        Mass.Gd=(Mass.Gf*Mass.Xf_nk_m-Mass.Gf*Mass.Xw_nk_m)/(Mass.Xd_nk_m-Mass.Xw_nk_m)
//        Mass.Mm      =   {['nk']   =base1[nk].MM,      ['vk']=base1[vk].MM      }
//        Mass.Tb      =   {['nk']   =base1[nk].TB,      ['vk']=base1[vk].TB      }
//        Mass.Tc      =   {['nk']   =base1[nk].TC,      ['vk']=base1[vk].TC      }
//        Mass.Pc      =   {['nk']   =base1[nk].PC,      ['vk']=base1[vk].PC      }
//        Mass.Vc      =   {['nk']   =base1[nk].VC,      ['vk']=base1[vk].VC      }
//        Mass.Zc      =   {['nk']   =base1[nk].ZC,      ['vk']=base1[vk].ZC      }
//        Mass.Omega   =   {['nk']   =base1[nk].OMEGA,   ['vk']=base1[vk].OMEGA   }
//        Mass.LiqDen  =   {['nk']   =base1[nk].LIQDEN,  ['vk']=base1[vk].LIQDEN  }
//        Mass.TDen    =   {['nk']   =base1[nk].TDEN,    ['vk']=base1[vk].TDEN    }
//        Mass.Xf_vk_m=1-Mass.Xf_nk_m
//        Mass.Xd_vk_m=1-Mass.Xd_nk_m
//        Mass.Xw_vk_m=1-Mass.Xw_nk_m
//        Mass.Xf_nk_=(Mass.Xf_nk_m/Mass.Mm['nk'])/(Mass.Xf_nk_m/Mass.Mm['nk']+Mass.Xf_vk_m/Mass.Mm['vk'])
//        Mass.Xd_nk_=(Mass.Xd_nk_m/Mass.Mm['nk'])/(Mass.Xd_nk_m/Mass.Mm['nk']+Mass.Xd_vk_m/Mass.Mm['vk'])
//        Mass.Xw_nk_=(Mass.Xw_nk_m/Mass.Mm['nk'])/(Mass.Xw_nk_m/Mass.Mm['nk']+Mass.Xw_vk_m/Mass.Mm['vk'])
//        Mass.Xf_vk_=1-Mass.Xf_nk_
//        Mass.Xd_vk_=1-Mass.Xd_nk_
//        Mass.Xw_vk_=1-Mass.Xw_nk_
//        Mass.Tf=(Mass.Tup+Mass.Tdn)/2
//        Mass.PA.Tf= Pressure_vapor(Mass.Tf, 'nk')
//        Mass.PB.Tf= Pressure_vapor(Mass.Tf, 'vk')
//        Mass.alpha.Tf=Mass.PA.Tf/Mass.PB.Tf
//        Mass.Yf_nk_=Mass.alpha.Tf*Mass.Xf_nk_/(1+(Mass.alpha.Tf-1)*Mass.Xf_nk_)
//        -- минимальное и рабочее флегмовое число
//        Mass.Rmin=(Mass.Xd_nk_-Mass.Yf_nk_)/(Mass.Yf_nk_-Mass.Xf_nk_)
//        Mass.R=1.3*Mass.Rmin+0.3
//        end
//        -- Дважды считать, требуется только то что ниже.
//        function column2 (KEY)
//        Mass.key=KEY
//        if KEY=="UP"
//        then
//        Mass.Xn=(Mass.Xd_nk_-Mass.Xf_nk_)/math.log(Mass.Xd_nk_/Mass.Xf_nk_)
//        Mass.Y0=Mass.R/(Mass.R+1)*Mass.Xn+Mass.Xd_nk_/(Mass.R+1) -- средняя концентрация пара
//        Mass.Tn=(Mass.Tf+Mass.Tup)/2
//        else
//        Mass.F=(Mass.Xd_nk_-Mass.Xw_nk_)/(Mass.Xf_nk_-Mass.Xw_nk_) -- для определения конценрации пара в низе колонны
//        Mass.Xn=(Mass.Xf_nk_-Mass.Xw_nk_)/math.log(Mass.Xf_nk_/Mass.Xw_nk_)
//        Mass.Y0=(Mass.R+Mass.F)/(Mass.R+1)*Mass.Xn-Mass.Xw_nk_*(Mass.F-1)/(Mass.R+1) -- средняя концентрация пара
//        Mass.Tn=(Mass.Tf+Mass.Tdn)/2
//        end
//        --
//        Mass.PA.Tn=Pressure_vapor(Mass.Tn, 'nk')
//        Mass.PB.Tn=Pressure_vapor(Mass.Tn, 'vk')
//        Mass.alpha.Tn=  (Mass.PA.Tn/Mass.PB.Tn);
//        Mass.Pn=(Mass.PA.Tn*Mass.Xn+(1-Mass.Xn)*Mass.PB.Tn)*10^5
//
//        for k,val in pairs(Mass.Tc) do
//        Mass.Tr[k]=Mass.Tn/val
//        Mass.Fr[k]=math.abs(1-Mass.Tr[k])^0.28-math.abs(1-Mass.TDen[k]/val)^0.28
//        Mass.Fi[k]=0.29056-0.08775*Mass.Omega[k] -- подозрительные числа
//        Mass.Ro[k]=Mass.LiqDen[k]/(math.abs(Mass.Fi[k])^Mass.Fr[k])
//        Mass.epsil[k]=val^(1/6)/(math.sqrt(Mass.Mm[k])*Mass.Pc[k]^(2/3))
//        Mass.MjU[k]=(0.015174-0.02135*Mass.Tn/val+0.0075*(Mass.Tn/val)^2+Mass.Omega[k]*(0.042552-0.07674*Mass.Tn/val+0.034*(Mass.Tn/val)^2))/Mass.epsil[k]
//        Mass.Vkip[k]=(1000*Mass.Vc[k]*1000)/(0.422*math.log10(Mass.Pc[k]+1.981)) ;
//        Mass.MjUp[k]=27*math.sqrt(Mass.Mm[k])*Mass.Tn^(3/2)/(Mass.Vkip[k]^(2/3)*(Mass.Tn+1.47*Mass.Tb[k]))
//        end
//        -- Теплофизические параметры
//        -- Плотность жидкости, динамические вязкости жидкости и пара, плотность пара, поверхностное натяжение смеси
//        Mass.roz = 1000/(Mass.Xn/Mass.Ro['nk']+(1-Mass.Xn)/Mass.Ro['vk'])
//        Mass.muZ = (math.exp(Mass.Xn*math.log(Mass.MjU['nk'])+(1-Mass.Xn)*math.log(Mass.MjU['vk'])))
//        Mass.muP = Mass.Y0*Mass.MjUp['nk']*math.sqrt(Mass.Mm['nk'])*(1/(Mass.Y0*math.sqrt(Mass.Mm['nk'])))+(1-Mass.Y0)*Mass.MjUp['vk']*math.sqrt(Mass.Mm['vk'])*(1/((1-Mass.Y0)*math.sqrt(Mass.Mm['vk'])))
//        Mass.roP = ((Mass.Mm['nk']*Mass.Y0+Mass.Mm['vk']*(1-Mass.Y0))*273.15)*Mass.Pn/((22.4*Mass.Tn*1.013)*10^5)
//        sigma_pure('nk', Mass.Tn)
//        sigma_pure('vk', Mass.Tn)
//        Mass.sigma = Mass.Xn/Mass.sigm['nk']+(1-Mass.Xn)/Mass.sigm['vk']
//        end
//        -- важные параметры Mass.hp, Mass.w0, Mass.d0
//        function column3 (KEY, plate_key, plate_num)
//        if KEY=="UP"  then
//        Mass.Vzh = Mass.Gd*Mass.R/(3600*Mass.roz*Mass.N); -- объемный расход жидкости
//        else
//        Mass.Vzh = (Mass.Gd*Mass.R+Mass.Gf)/(3600*Mass.roz*Mass.N);
//        end
//        --гидродинамические параметры
//        Mass.q = 3600*Mass.Vzh/Mass.bsr;
//        Mass.Vpar = Mass.Gd*(Mass.R+1)/(3600*Mass.roP*Mass.N); -- объемный расход пара
//        Mass.wk = Mass.Vpar/Mass.Sk;  --средняя скорость пара в аппарате
//        Mass.w0 = Mass.wk/Mass.fc; --скорость пара в отверстиях контактного устройства
//        -- кинетические параметры вне цикла
//        Mass.Dz =  (7.4*10^(-12)*math.sqrt(Mass.Mm['vk'])*Mass.Tn/(Mass.muZ*math.exp(.6*math.log(Mass.Vm['nk']))));
//        Mass.Dp =  (4.3*10^(-7)*Mass.Tn^(3/2)*math.sqrt(1/Mass.Mm['nk']+1/Mass.Mm['vk'])/(Mass.Pn*10^(-5)*(Mass.Vm['nk']^(1/3)+Mass.Vm['vk']^(1/3))^2));
//        Mass.Scz =  (Mass.muZ/(1000*Mass.roz*Mass.Dz)); -- Критерий Шмидта
//        Mass.Scp =  (Mass.muP/(1000*Mass.roP*Mass.Dp)); -- для жидкости и газа
//        Mass.mm = Mass.PA.Tn*Mass.roP/(Mass.Pn*10^(-5)*Mass.Mm['nk']);
//        -- внешний цикл метода сканирования
//        for i = 0.02, 0.05, 0.001 do
//        Mass.hp = i
//        Mass.eta1 = 0.068*(Mass.wk*Mass.hp*Mass.roP/(Mass.S0*Mass.roz*Mass.Dz))^0.1*(Mass.sigma/(Mass.wk*Mass.roz*Mass.Dz))^0.115; -- эффективность тарелки, работа Л. : "Химия", 1987. — 576 c.
//        Mass.h0 = 0.14*Mass.q^0.21*Mass.hp^0.56*Mass.wk^(0.05-4.6*Mass.hp)*(1-.31*math.exp(-.11*Mass.muZ))*(Mass.sigma/(72*10^(-3)))^0.09;
//        Mass.Fr_1 = Mass.wk^2/(Mass.g*Mass.h0); --похожее название с Fr[k] строка 101
//        Mass.gs = math.sqrt(Mass.Fr_1)/(1+math.sqrt(Mass.Fr_1));
//        Mass.ropzh = Mass.gs*Mass.roP+(1-Mass.gs)*Mass.roz;
//        Mass.hst = 0.667*(Mass.Vzh/(Mass.Lper*(1-Mass.gs)))^(2/3)+Mass.hp;-- число 0,667 получается от возведения в степень 2/3 числа 1/2)  высота парожидкостного слоя?? высота столба жидкости
//        Mass.u = Mass.Vzh/(Mass.Lper*Mass.hst);
//        Mass.V = Mass.Srab*Mass.hst;
//        -- кинетические параметры вне внутреннего цикла
//        Mass.ee = (Mass.roP*(Mass.S0*Mass.w0^3-Mass.Sk*Mass.wk^3)+Mass.g*Mass.roz*Mass.hst*Mass.S0*Mass.w0)/(2*Mass.roz*Mass.V);
//        -- внутренний цикл метода сканирования
//        for  j = 0.0015, 0.01, 0.0005 do
//        Mass.rkl = j
//        Mass.d0 = Mass.S0/(math.pi*Mass.n*Mass.rkl)
//        Mass.hf = 2.45*Mass.d0*((Mass.roP*Mass.w0^2)/(Mass.g*Mass.d0*(Mass.roz-Mass.roP)))^.35 -- высота газового факела
//        Mass.Udinz = (math.sqrt(Mass.roP*(Mass.w0^2-Mass.wk^2)/(4*Mass.roz)+Mass.g*Mass.hf*(1/2))) --динам скорость трения жидкости
//        Mass.Dt = 1.1*Mass.Udinz^4/Mass.ee --коэффициент турбулентной диффузии
//        Mass.Pe = Mass.u*Mass.Lzid/Mass.Dt; -- число Пекле
//        -- кинетические параметры внутри цикла
//        Mass.Re0p =  (1000*Mass.w0*Mass.hf*Mass.roP/(2*Mass.muP));
//        Mass.Cfp =  (Mass.const_plast/Mass.Re0p^0.2);     --коэффициент поверностного трения
//        Mass.Udinp =  (math.sqrt((Mass.w0^2-Mass.wk^2)*(1/4)+Mass.g*Mass.roz*Mass.hf/(2*Mass.roP))); --динам скорость трения пара
//        Mass.R1p =  (11.6*Mass.w0*math.sqrt((1/2)*Mass.Cfp)/Mass.Udinp);
//        Mass.betaP= BETA(Mass.Udinp,Mass.roP, Mass.R1p, Mass.Scp)
//        Mass.Ugrz =  (Mass.w0-Mass.Udinp*math.sqrt(Mass.R1p)*math.atan(math.sqrt(Mass.R1p)));
//        Mass.Re0z =  (1000*Mass.Ugrz*Mass.hf*Mass.roz/(2*Mass.muZ));
//        Mass.Cfz =  (Mass.const_plast/Mass.Re0z^.2);
//        Mass.R1z =  (11.6*Mass.Ugrz*math.sqrt((1/2)*Mass.Cfz)/Mass.Udinz);
//        Mass.betaZ = BETA(Mass.Udinz,Mass.roz, Mass.R1z, Mass.Scz)
//        Mass.kxv =  (1/(1/Mass.betaZ+1/(Mass.betaP*Mass.mm)));
//        Mass.kyv =  (1/(Mass.mm/Mass.betaZ +1/Mass.betaP));
//        Mass.eta = 1-math.exp(-Mass.kyv/Mass.Vpar) -- коэффициент извлечения на тарелке;
//        if Mass.prop.eta < Mass.eta
//        then
//        Mass.prop.eta, Mass.prop.eta1, Mass.prop.Rk, Mass.prop.rkl, Mass.prop.w0, Mass.prop.d0, Mass.prop.hp = Mass.eta, Mass.eta1, Mass.Rk, Mass.rkl, Mass.w0, Mass.d0, Mass.hp;
//        Mass.prop.key = plate_key; Mass.prop.num = plate_num
//        Optimum = Mass
//        end
//        end
//        end
//
//        end
//        --
//
//        column1()
//        column2(KEY)
//        for key in pairs (base2) do
//        for num_plate_in_type, value in ipairs (base2[key].Param) do
//        zapros_plate(key, num_plate_in_type)
//        column3(KEY, key, num_plate_in_type)
//        end
//        end
//
//        return Optimum
//        end
//        --
