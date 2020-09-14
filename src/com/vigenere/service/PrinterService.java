package com.vigenere.service;

import java.util.Map;

public class PrinterService {

    public void printFrequencies(Map<Character, Integer> frequencies) {
        System.out.println("Frequency to each letter in the text: ");
        frequencies.forEach((key, value) -> System.out.printf("%s - %s\n", key, value));
    }

    public String getText() {
        return "cyyzvmgurwbszxmehacexuzyfgqeoslnuqqpijhpxmoelhaxmhvipcysahyfiyrqvgnwzieilvovyxkuqchmemiaodmasondmmjshnraugihbjueayhbegidmuifawqwjyszhavyfrgqdiavaqrbsfvhugauorddsyingwmlgquawpepiozozsheyeofspelnruezxyqsdmcyymopibetrzufqvxnrqlanyacawqyyyccyqrnrzufqpfbhuhagizcgqxmpecemzgyeccyqihpsdvmtiejqrfylnoxkgrmrfdseihgfqtgrbnrawpiprfpepimzoeugihbcnwfehgsovqhiermqmmmyodkmimrfqrmhcfqgwesjrfpidegfsupxymrgbedexvgueoemrobsxmnvqmgaqinzuxfilnhgvmxiebayeilroxmexupczwomyahqhmwwbbpmqwxnjuhmvynzxmytuqsmfexlnqqwbilvuawmwyqoegarwrdqwmtlvcdmcyygcbvajoarmqqrnrfqzapprfmqmwcagfmfycrgqgaqnbvktaxbrhugawvrbqjugcbgvrawfvquxatyeugrfelfsymzgiefqvysmacbidmabrqwqvgbgmgoymnrawpicawymssmqoomhmfvgmseiufooxgeyftdqmwxruazqvhbrqqaglnhugaimgcpiexcaopeeexhfmvqefnfsedwyvbpirmhvrmqqrnrszxdinnbfsmgiefqrfixraagdenvqmgdimpsoszxcaimqqrnrgataywbgawcyyqihmpegragmfsmnwzhmsmdiqxqignrqqaglnqueosgbiyhakgnqarfvubegexhyaopehefraawrewgcetmvurgfiesmqseeexlrgpsekiisdrawxraagdenvqaweskhoxugilpcuwmgizcmwyehvtqwfeyfraeflyvgyscyycodeawweszxqwyzbmhmtlrxghuguzceefxlvpgxawxbgpigwyfhahmzcnsexqjuphaiexupfqrmrufjuvfyxrgmfesfhhmwyemvbpiyshfhdepemqiyervgnrqkazyebarakueozxuevngfezxyqcetdsaesewawxnrqqaglnqueqqyfqdihmuycdholyfhqvrmyyrcyqxiqcesewszdfsyemdiqnyecfhurtepvgfsyelpodiyruuwexavcnomtbvikwyeahytfmrpimgfmrejieamiesoeshsxyyfbawqmiqiykazyebaijmmgwmqcyyyzmlavurddssvyqwmqpmuewmqqrnrsyjdehnceluwnbfuepslrgzsewifqarfigccdeziifdmwyegqscyqewehqemvcfhagdewvoqsopyeczsfmprgeiygizdditihqwpscyyrareoixnwdvqpctwaugiwnrmhueyfhmzmquvgqqhsanoovqruacetdmpvzqkusmqszeegczszxariccpmmquahqveijbfyeuwnrabspiprfueyzlnoyimexrdqvfylooqwuqgvbqrfimaoahuihgourhidnrmwpmzssdizxyfqxeewyfoymeilvoesdhcqopseguzdarqdyfrqzqvcnhqpawjesbedexbogqrslzwpehifyshezxuzszxawipwmpbsxrfueyxyecnwqvpnraeeguhgmwuqgrruefemqiyedipbzgszexrgavpigqoejuruaoeizeaecewqmlnrqwukonzpepixbgfvufogceeetlrjuwqwkhseidmuzdawemprwesguorgqrawuswsydeggoqwzsmrfqexmmnfmqqelrjapgslrpqrfsondqwmvxrgqvxihgomeogozixeahifgqyeifraqrfsmdiqsuxifsoyxsmqsyszelpvuemfmbzgxmigdiqsewyhgbvurwvdusewyscdeyvuqwoezhitfmhgefrqarexuahqqqrnrhurtegccexaeifcxlawxrbmxgvurgqiexlnbtseezeamhqkiisdragizcbidtygimizsmrdqvoivvoosysozfqkuqyaegifmhuoriuxinizmpexrsmkdehqslepezeozebsxrgeimpahapmmwyerqwfvovraeurxnsylgqynhfvufovomtdsmcsdmpexrrmrmszeozgqwunceigvytwyiztiywfmosyiwmqmmmpogwmwxrrqkqryeoarawabjqvzsmywhvqwwbaaeurayofidvuqccyqrusfmrmsgnwetqvzrwfsysxrzahmqiaodgtmunpesxynnoewuqhfsexmqifvanqexraagdewvohmoxiewawmezvugvmwyacemzzyaquzqpywbagarwrpqqawjecsvqwmbtdepsmriuqbilvcyeetieegiqwnnqqkmgiatuezeupoeszshbgfidvyfsdzmhibtgxgvihapieihtozseigrztezxynccyqwistdigearfmscyyngemexchfqzapobtdezgymozsfilbcekazyebawpigbqdefmwbgridqyahawpixvgesxyifirjugcrbfietueozsejumsdiyhoiwpedhufimiexuowxmpexrjqnmqifamwmrnrgoszzgqsrmzmlbgqrfmxbfqwfvcphaxmpprnqboimfwheyihgsdiexlvqfscyyqoyseekhwbexepeopiysweoommquvbqizxyarqtavxraagdewvogruguzszxqygntdqmtuehuggpuerqkazyebalmhongyeziceoehqgiaqqfqvitchidriqiyeeswvspepiyqotmpyufrujrilrbfiequasuvmwxrobvqgcnfmwdifnseizxlruazqvhnbfieiabjqvzexbgayakiisdrmrnrggtqvcbfmshemfoxpawyhqtirinhhavqkovoqugefdiqvcyyfsveyemfimwrefgoesekiisdrmhifrqzqqfusfspsiesetqmnbsqqoemboxkgqjbrqvavygwdedpbroeymeophavuhuqsayawabjqvzehgsewawczdxieearbfieignbpefelvcehawabjqvzexbgarqwnrqmwaewrbeydeozruvqmnboavukyzrmeggnbfuhmhyesempihbgsshilaopseuoropsayuesfmdegpcysvyftoyqmmmhhupqbwrdfymrxbodyewcnsmxgvkhwmiyuorobvuqyvfmjdquqssshilaceiyehgsyeurxnsyxahunggebylrnmxahifcetmmtrgpeqylbdmiyfieofizluzopsbxuqcrvyemzwjxmwxrhdezwcbfqgarbrqqvmqufcnidehvobsbyfnfuwfsznnqqpilvjmvmeophavuhuqspehshgopipsmtchidruqceiexusfyepiabjqvzskhsyeurypvmqmhyzcovmgcnsqwfegrgyeemaawrmoeiyvqefxlvpgmdicasexqimgipsbelnshmfelhamgarzhgaxatlrxghugcnzosysmrfuemhyzseidzcergqfilzcosyzuycdhujzrfqrfijnfmgmhuhapizwxbbpizsmisusqwnntdqmhytchidrifsdhujzvquppmtrzagaqlvuavmqyhjdeoshfhuxgmivbspqduntgrpeiqceiexuqceyzmxbgpemqyewoemvyicxyajlnboilezbfmqurkhsexushnjqpyihgspseifraqrfsmdiqqmmmpczgavlrfmqbelnoexdehftavyeyfdapuxcpoeiyjuicdhmhyzcovmgcnbayxxczceioyfbamwbelrqqqyicaggjrmwvszxqwjnfmhmvyzsjtxmwncoenefqsfsxeltoevqziyiqweilvobvqgcfcvyzxueztieembpdeehifdtmxsmbdtseixbgeenmifegibvycodedegbsetuvcgcbsbyfnfqeegiaruieigdiqsbvitfqwesmpwqrfmzvqagapfbqaymtlbrggahuewcyqdufsdmmtlvbombefzszxqtlrquwaimgipedempwdggqmgozguemuwexavcpoeugixrhqvymhnfmqaimgonixiwvaqrfsxnrqqaglnqueomlpiywfehpwmwpmzssdizxyfdmvmguqozeatufgmrpsxnegiexiqsavukyzvuwfslvopsekiisdrawxraagdenvqawhigbgcyqimgorvyexruazqvhbgqxqqgbgfvmhinhtsvixhamkdehqsurexuowxmpexrsmwemgpcysmwonrujrymbfmtuhunhdehwxrhahawifdmmlimqoqydsjnbawxipnoeybtldiqhqzyewmqqbcfhuvoeofoehqslqsykqvuysosyqoagmxahifcetmmtrgmwemggoyfqquvbexmfcywpepixbbazavytwyiziggcpeeemaoqwcyybopsbxueoysnvctozseemhgbiuxuerqugiwrffeyihgsoszxlnfmugefdiqvfihqszgueihsxiyihgcqweihpwmppemfcomqhuqseqahyebmwoshusompeuuwexavcnrmjdehnegiqqgrbawpygfsoyxsyfhzefilpsuvmvycinpugurhqqhmmgcmpfilaodiywyzczedgbvoemytyewawqvycinpugufqaqgquessyxelvrmhquongutqvcbrugmebrgbezlurbfvqsjewyiuvirgfenifrquqqrnbdatgpuesyimewpsewahihzfmyslrwzsfipraqrawxregedihgoxihehgoyizxifaupuxuesehqrugidileaeohiyecbfbedxyqceugeyfgqeewipwaymtfrpqieevrgqkqvuyaqrfiidiqxqigfwpsqwinwzhmemesbynpcpoehmegrfugmwhnpapuzcnrqugenbflibvyfwpizxyfrmvqtoozugmxlrnqqavlrfmqmwmngemzexbgayzsykwxmawyrloibxonfyseevrzsmoeifsexmhifizmpsmrourpeuvhmpuejbrqvqqifrudqvkhsbsdxiqomtmvnrcekazyebawbsjhzmvqwzhbogushnayexihbfmvawibfukqqxrdqvfylooqweswvoqwcyufwbidquaszxqwjbrqqawwbbopgmlqoeymlcfhavuekhsmhqqipfmguehbgqrawucfqwqrnnqaqaxyarayypueuajgxoecqqqwgborvyexruazqvhbegieinraysexlnraqmmmsfmkupgnwejmgcyaqrfimhxqmfeupczwfehgseqgxurgbsewcisxizgiahdedempogwmwxrgfeemhtixedjuyhmhqikhwxmnvcbrawfigcceqahyebawmqyhjdiygyehaqahicfqguwiacfeduorrqwpiipcyiahifsoyxsjeseizxyqcuweihgwyizxifbmgushnsefqqxvgfmzgnbgmgfyuzgafdiuridsbeipquhqrnnzbedefusehmviacyicyyyvqwpsifegiawxrhqwfeghaamytyewmpuwgbsasgxlbcdepmwnzuwysnbrastsgraafeiliopsdxyebaxmhidiqiyxiqoeeerurgyspilaoelmygnzmvseufduvmsxrszkdehqsomyihgcpiavxraqhqmhqsbizhyaqueuwnbegizscaruzuhobopugmlvifexhyfszzappvaqrfskhsolqkunqarexcgiuvgqxbgsizilbgyeuwphzsedimqsxsggoeoahqpcewahmwaeozhqdufoehqhyewcyqdurdahqvgnbujqwnnaeizembquipexrqaqukonzurfihfwpepiyhabeudjnfmwqvaeozhqtueopedvynzuwmsurgfieshucmfesliszxqrypsewuxuhasvmrxrsjidgcgcbvqgcfofidignfyeeygnegezxcqopipibbaqreuongumsyuyhaxmpcqopipsmiodieruszdhmixnrqsdeivabidmuyweqaiuqsysovupwmwamlesoszgcywmzqmmnqarpmiccdijgyyzqromuqcbvuqyvfaeafyqwqromuroneeizhbpeyihgoxhawabjqvzsmccbyxelrgmpufyermhqhyqweggwmbsmjmgoyrmhqhyeshsxxufsytdikhsqwfemqimwfihqszguembdbsexufgqqmrcssexmvyzopieslqsywqvcefqqqhcnjqpmzcphavuejbfyvmviqsubmvxrdqvfihpsdeamgcsdmmpcfaatavkhsawqrnvaqrfsxndmdqslqsywgtyewavxmvrfpepiwbaqedtiewytavpvcxizxuzszxqeiospmqrwvoqhqtivgmeosyqioefmpnctenmnbhavzefusmwagcrrmhqevfcxyfegrbfipswvzmwqkoarmhmwwnieeehycsdxgvvncqrgqyeopeeslnrugmpcfaaratiqsdmmluisdyywctbmppsnrabsyecftavymxnjqpqquvgmqqeuqcdtmvubuazqvhbdatgpueraugiiaoeguqyahahqklhdawuvlrqaromfvohiuwhnamweexndatgpubegiqwnrgsvgtifgqjavgraesnvyhammxpofcayesvesgqmfufsdimpgrbfivymgoqgaqinfpsdfyyzugawirormzhizohixuorztiehiboetqgnbsmvukcqslmzuorpdezxuisxhgqufsuxmvyywsmawunrqqaglnquefilqszxdsxrguyyguaqdsurwhfmzqpjbfcyqgizorvmuornmhmgivbtidihgsmsekiisdrawjbdgpmvyfscyqpbrghiyhusfmkyihgoaioshgbgeeyvfhuxgmiqcbspilrdavaynecxepswbaaietcewfspiahsdvmmhgfmremarbfipslnrugmpcfaasbilvuatmvunsexmfcywpepixnrqqaglnqueeilgozxaquvcdugehgcyeuwzeoosejiesyseqyvcehqvycfqwesynegixpurgbiomyqsdepmwnzuwyskhszseejcodioiwbaaraqyqszmtmfvgysmrueqtmeqirgqqqpbnbfieenucvimmhqozsqrwbbfvayzeamhqkiisdrauoroeefmmswliewyasyizgiahdedtieqqvfsjbweugihbhqqayneomwbmlncpirmhvrmugihbgqnmexrgavpigcsdqmryahqeehyzcovmgcngqroshgfmqdiuyaqrfihrgfeejlzoehavuqwoexmmzcgqurczwsscyyngrelsmpwxpmvwbbexmrnraqrfiyahdimzcqoqeyslgsqrfvybgyeximpczwfmnhquszeyfrawssprfzsehyzcovmxcpceicyybgqqnelnoyhqefpozedscqsmpcyyacpsymhvcmfexlnqfsxlyfdmvqgcnrqwfmhnraebyfisdmeeiqcbspilccxmfmwbvafnimcszwmuoregezhihatsyigngbmdeufsdpuzlrccyqvynzyizxyqseiveozobedxyqcsshilacaugiuqsysovupwmptiwbboipigngqwfejnffizsabjqvzsystqgfmpncgeysmngbexepeoehqnuzsewfijuszugignwzifvuagovqzybwzhuzcqiaugijqsmqarnbodsyecbfzyyilbrqjdeazszxawjbzuxugifbgqeqiahqkazyebmvavyfhaiygyehawysgrbfseygpodeoxyeszidkcpczsgxlbgmeexopwmrayneceeoejnquhmhynrymzmmgfmxuzuacgxdsmnsxscyyaquezsogfawmtifgqhawfbumvqwwbayyzwyntmgupcqopipiifobvazyvhmvzygswytdenvqatqvgvhfiyeozvaqqqnesbedtyycelaqvecehawmriezuwcavawqhcewsmxsmasexqsoaocyqpfrgqrfmxbamwqqnbrasoembceugiyfharmjcysuvmwytiqqmhcesospsmpvqjqwxhamtdsprbuizgcncghmsogfmuginbamqagizamrpsxntavmgiyzqgfmpnotmexiewmhmwyysuiegiavqguhufonmpsidiqwukhvtugmsuyodkmqyahahawostdesmipcysyicbrqexguaodyyedhgfepmmgfufgmiqcbspilccxmfmwbvmyyeprfpepiceooebmnnzuwmsjbzuxugupcysmgucwfexmmncqgarizwoepimgodieyfgoaesmigopecyyyzmsqqjeseedmiccxmfmwbczsewivbrpgihgsmrmsgnwehqqipfmxuguqcyyzhibibixsgrbawmtiahmhmgizcfexsmrgfepsmhbuhawizsxlavyksytxsxngukzmzvqmscyygsyspmlrwfspipbhmvmpfvchsfsozoyidguaqueosgbcmpssxbcgsegyesmiesjbrqvbelnegiyquvgesgfyeqmtuxuyweedtiewewarifsdxqqyewpepiustuvyeldiqseyzsfmkusoawhidwuyhavzemrbmtdenvqmenemrbmxgvuyrgqmzyermhqmlnhkvmrhvourrifvnyizxycodezwnraawoshusompsxrgafqnirgfeekorfdeehissghmpcfaatapcgwosqeyeopsequeegilexbgqpqmnbfmietuesoiqwnnfyyuxiyczkqhifsgjuqmhdbszluzcetavgdiqiexyiwomawofqqtfmprzpioslesoseyjcczlmqifegiawostdesmihbuzqvmnzolqkuhapmmezhbogushnfqqbilssuxmpcosdhmhynvktaxbrgqmdvynzuwmzyydavcyynzufqvxnrqmytfvqmeoshpcdvqrwvoqhmhurgfeawuzpugusmbgqsetuehuhawmhfsiymgzspmmxuzszxqrufggeehcywsizgcngpiosfusuxmqufgqjawmrdawemprzcyqsmhtrvmkcbdatgpuetgrogcbbmweiyzdqvricgoxmnilqopizsnrfueysmasxpqygnumvmrnvopibvitfqwesjbfcyqwuowpscyuahasqwjvfuxaticixedigessvmexisdwawneozwrslzoqwcyybddssvyfgawomyahujugivbpmoebnaqwyswrffeatjbgusqrnesmhqqipfmgueyngomqrwvomsyimzcfiytidiqehmxnrawssprfzsehyzcovmxcpcetqpuvbexmfcywpepiyqsesdhyzqarfrongzsejumrgzuhuerawqyzhhgvaihbgpiubufsyietyeozepijbrqvysmnzoezelccdqqmiqsxpqwubfpiyimrugvmruasoiewuewmwmsjecsvqwmbdavaynecxepsufzuiehuuwexavcnrarawyksytxsmqiyemhgvfmzqpjecetqvcqopiesvessmyihfdapuxcpcefqqxvjqvesmrofsbtifhawmlcfhavuezhbpmmvcnaqrfiuewexaglnhmhudmgfmyewuzouwxeltofizxugwhepilruqrqvubbmgushnzcyqluqcuweiwhzawfigndbediwvraizxlrbesxeltcbpmriqcyeduornpibsgooxwqxcisewqtiqwpsyehgsdwqgizqqvfitnbawmwmrugvmvcniytdsmcsdsrynhfaqmwmbpgqmjlzopissprfzscyyfsbediwvoniytihqagaquqsysovupwmifsxnjuecyufwzstejbffysyymwzxqpfvuqrfiyfwzgqvidiqrapuzszxqemhocyqhunrqqaglnquemxbrbuizwypivsehcngrsdeggcoydxifsmsmflvuahmuonzmedxyngomqrwvoqeblcycesblcnzmrmvuziyehiarhmsfsgnfmzupbbgmrailngqraygnodmexipfmgueyyshepembpdimwlhwzeehozoayfvunfuwfsweoommqovhaqmmmesexdmwgoawqwjyszhavyfegimxneomqmenuszeexiqcakqrcbcdmsmhnzpsyyhqcqrfswvjupuwuqcmpuqyahmzmqmrdqpmmgccemahyvabsexifrqwmtcrrmhawmbpdigqgvztedhypwpepimioewmpfngqsesjrfmvusmuoniuwkhsesnexvfqgahycvuhuemyshezxueoysbelgvqraryeoywuqjyseieglnjawawyfhmhawoawpsewiqcevmvifsjiytfbgqqcyynrqqaglnqueqsjecsvqwmbjaeewipwmhawyzqmtuxoycqwbiwvoxzqvyzcescyyaodimpcqopimhyzcovmgcnbmeyilvqmqmmhrhagmryfhqtarnbiyepemdiqwfimzouwsvuisehmwxraagdewvoeeewongdixeyfqaqmuorgfseswvoxgduorrqwpiizcyizxiracyqempzmweimyonsdmifoegarkhwexqqiccpidliqsbixsmfsgwyehqofedmifsjidgyycqqbviisuxahudiqpxemzseqmwwyoewqwmhdbsquoropiysweoommtlrhqrpilpcdvukceourvymgwmipimvugexhuqscyqliwseipruqwexdmvhwahmvcdiqdmixrgfefihgofmhejbrqvuelrggpfelnggemrcdiupmsozobedxyqsexmhyfhdsqwypczwfehgsyizxycsxsoshfiysqtueocyqimfobedxyfsdibviqileziwrgeedmizozxqvurbqvsmuqceqafcfrmtdsxhqasdeyfhqwnemrwmqeijewzgutuyaqrfihnzuzdiwbbosdvyaquediwbbtioikhsawysvvgcyqruucdebvyfszxqirpwfeyebhamruhuqsmsfvuooxlaiubzmfavjnfmvqwofquxmvuewcyqduracymrnvrmhqwyzddiovyfqqrfimbrqrmxoeslemeleoexmvcatmpxmprzyizxynrqwukonzpepihnddsbvcnruwfvcoiuspimfodmcyymomxfvcoiqebvifdqvuhuqspseimgopseyhvrawmsueravpefhqfebifnjuhmwioiykazyebaiyuorhahmwuffqwfvcpsegailpwfmhemfsdipytramsymhvaaeeyuoszirmwnddsetyewpepivngqmmwyvbfiuvuzszxqrufozxuhuqspsoshgfmgfsyaoqwfevvzuhmhyqobvatlvspepijewhepeucfuqqmlnwzwfvozszxaemrugrpelrqaqbihfopseywpsewarupczgavlrbommyhvjqveefrluwfigqimwoenruavuemqsysnmmqwliqbcfhqqehongesnecatxyqrwvopeeuonseefliwseibhycfahgdcesdibviqilmdeyacdqquonbfmpexrrqqmxyewmierypsewmvcbgeynwcfhqromuroagarzbffspebhamruhuqsatdmgrwdsecmgsyeahuywhvqgiaqavdihpwmsecmgsyeeiahwpszeuzsdmoexbbavfiifssyzhipczwuwnrsyhmvwbbfeemgczqwyihgspeeyugodireierurmvcnhmvqjuswjepennzhiltiegqrtslrgqugmnnhuzawyoczwyemvabsexuncevqguyquxdehgsetqpucfuwasocsxsolcpcfirscqsexqyfgwysecmgsyecyyofaxayuzodehmfuceebvifdqvuhuqspsbilfcnsemhpoeifilzwzefehgccymrnbbapaihfwzemircsdmqrwvoesysmscdepsmnqaropovfcyqxiqomwagcrrmhqhyismhatnnfgqayihhdsecmgsyeesvcszepiwnfpebihhfuezecaozmairnaurqqifoetdsjbguietlvbombeyfbmwgenuseiqqjewyiuviycsedrifsbvazudiqepigbqdeomugszlmymnraiywyhddshicgcpsbsxrfcyqgiaegmexihjqvpexregiawostdesmihbuzqvmnzeifslacgenemrrgqmzyermhqmlnhkvmrhvoeisyhqcmijtlrgespignwzizsmtchidrifrqqaglnhugawnraeirslzopshilqopiuvufcxmselpvueeexzwzmexlnbpsawhruagusmqcqwfexbsywqyjechiuxirbfvqrmaceyxxczcegurwbszxmehacenfmpraawpscfsjiytfbgpifclnbzmmwxrgfeqwjrquigqundammrxbgqrmzcbzqromubbajmziefqexeihhdeqvctwzhaewbfdybsyzgkwfigndapuxcpcqzuzyaratavyfhqqqmirgfeesfvumvolcngsshilaoyiywyhsjgxymvjatdsprwfsmwweweiewipwmieiypczsymwngcyqhierurmvcbztiewopqqhqqjecheyrifibidevhbpezxyzszxqqufegezhinrqqaglnquefmprfoszwytiuhakiisdrmvlroxqqrnrqaqahyrgbidelqoevqjieamwbsmfwhiuwxngurexcgiuieixbgosexozsegxelbegizsjbrqvpickodhqkiisdrmvyzgqynihrtugusufzqmeuorfqwgpnnfahqwmrbazaimgopseilbrqrmxoeslemqiqwrmoelnzuzdiwbbosdvyaqueqrintdsgbuecbsdimfsreoxibgysnmmqobvahopcpedmkhsleqrnesgqmgiaqavdihpwmhqwyatdimhuriyvqkczszhqimpfmzuhirluwfigrgfepsmvbfidqxvceiexmrugvahuccewqhufggeexyefmwatlbddmqxuewaggnifpqretiqsyqmrbfsdijtlbddmmhifsyfqryswomatoozugaribwytawnbhmqnighamtmvwrzxepsmrifvmfuyvaifsxnjuezsiogfezxyngyyuxuffqwfvcpseugiducvieszsfqspmlrwfspijecbvuixnrqexicnwzhmhyvlayqwnvagpafufhmrfijnfmefslaodebtygsompeifmexqquqoxmhvypczgavlrbommuorbmzqvxnrqtqvnhfneaxlnpmptsykqxyurxbobpqfyqomtdsjewmspsmsfggfsmzozxqrxbourhelvohixqyahqrmqcfsdmmquvbqwgwnrbfecyyuomtqrufrgeegugsssdmufrqqafcfgafmmhszgizgcnrawcyurgbsewcisxeoshfsdzmsynisqqrnbrmvuuornmexmpesoszgiefqromuroqwovuiwpsyemqsreoxirgfiewsfhqqmwmbtgrpegrbfexqyahqmsyurgmpuzlrqarosleszguewesayagucwfexmmzccyqriqwrjqvyrgeizgcnzyizxyqoqwovuiwpsauorbawqwnbaawfvuaragxelnaqrfiuffqzaporgesomurgoszxyzdavmryngzioimfodmaquahqvmejecbvueiqcejdywgcegaqiesosytyagmhaxlnpmptsyccdmewizseqarypsewmvcbhmqnigrgfenifrqqvmgiaqavdihpwmwafozoneeixrxgwfmuaopmexlvpgmawyewmtmvuqseietyeodhqxiqcatdsaesewawyndapuxcpoeiysmgfmweicaqmtmdxrfqwapprfqwfijecnpqqubqarfvuphahqzyfsdwmrnbgqqpypvrmqmwuysuugilrugpmswbbfvmgnbfqhgdcaraeaqcawysmewbqaidgcgwhepembquipexrsxihelraawmsgnluqaemcfafmfcywpepimqcegarneooxawczaavmimrwzngwnbgavmioeszyzgcnfuepivbasvmhinhahmejbzuxugudiqrajifgqhaqcaopebslhauhqefqsvyexcnbqqehycchmhiiucyiyhcmcqzmrarztseewewrmoelgipsmsykqxyempbrqwqrpbzhmyihgcpedmkhslemfxvqmvpskhszstsgratepignwehukhbdavuwmbdqreskhseibsliszxgvungurexcgiuieuorhqiytietuqzslzoxmeelnqarosleszguewbbpylmlramyytydiqraezecgbmqyahahmtlbrggaruqofidigbgmpmqyahmvfigbgmtarnnraexkoagpsezcpwawqtyewssehuqsysovupwmugmxvbpibvifwseysmnwzzqwnvumspsmfsgwqpyzszxawxrtdecyymoqtdswhfmvqqifrqtammngoszgfhgqwcyyqotmpipraawfmlnf";
    }
}
