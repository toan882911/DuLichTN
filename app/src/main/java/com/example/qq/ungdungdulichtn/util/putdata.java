package com.example.qq.ungdungdulichtn.util;

import android.content.Context;

import com.example.qq.ungdungdulichtn.model.data_map;
import com.example.qq.ungdungdulichtn.view.DB;

import java.util.ArrayList;
import java.util.List;

public class putdata {
    private Context context;

    public putdata(Context context) {
        this.context = context;
        DB db = new DB(context);
        db.open();
        if (db.checkCount() <= 0) {

            db.insertDD("Hồ Núi Cốc", "Hồ ở phía nam huyện Đại Từ, cách trung tâm thành phố Thái Nguyên khoảng 15km về phía tây, là một thắng cảnh thiên nhiên gắn liền với câu chuyện tình huyền thoại về chàng Cốc nàng Công. \nTrong cái mênh mang của mây trời, sông nước; trong cái ngút ngàn mướt xanh của những vạt rừng in bóng mặt hồ; rồi 89 hòn đảo mang những cái tên thật khêu gợi: Đảo Tiên Nằm, đảo Núi Cái, đảo Cò, đảo Dê, đảo Khỉ… và xa xa phía tây, dãy Tam Đảo sừng sững như một bức trường thành lam sẫm… thật khó dùng lời để tả hết vẻ đẹp, sự quyến rũ của hồ Núi Cốc – hồ huyền thoại. Đến với hồ Núi Cốc là đến với một thắng cảnh “sơn thủy hữu tình”; đến với không khí trong lành, mát mẻ; để du ngoạn trên hồ và đắm mình trong câu chuyện tình chung thủy ngàn đời trở thành huyền thoại của vùng sơn cước.\n" +
                    "\n" +
                    "Hồ Núi Cốc nguyên là một đoạn của sông Công, một trong các chi lưu của sông Cầu chảy vòng quanh một ngọn núi đất có tên là núi Cốc. Đập Núi Cốc được khởi công xây dựng đầu năm 1972 nhưng do Không quân Mỹ mở chiến dịch Linebacker I đánh phá trở lại miền Bắc Việt Nam nên công trình bị đình hoãn đến đầu năm 1973 mới tái khởi động. Tháng 10 năm 1978, một trận lũ lịch sử trên sông Công có lưu lượng 3.000 mét khối/giây, gấp gần 4 lần lưu lượng xả thiết kế của cửa xả chính và làm vỡ hai vai đập. Công trình Đập Núi Cốc hoàn thành phần đầu mối vào năm 1979 và hoàn thành toàn bộ vào năm 1982.", "honuicoc", 21.582487, 105.697165);

            db.insertDD("Khu di tích ATK Định Hóa", "An toàn khu Trung ương Định Hoá nằm ở trung tâm căn cứ địa Việt Bắc, nơi có địa thế hiểm trở “tiến có thể đánh, lui có thể giữ”, có đầy đủ yếu tố địa lợi, nhân hoà, đã trở thành địa bàn hoạt động an toàn của các cơ quan đầu não kháng chiến. Khu căn cứ này đặt tại huyện Định Hóa nằm ở cực bắc tỉnh Thái Nguyên.", "atkdinhhoa", 21.788216, 105.508607);

            db.insertDD("Thác Khuôn Tát (Thác Bảy Tầng)", "Thác Khuôn Tát người dân địa phương còn gọi là thác Bảy Tầng, thuộc xóm Tỉn Keo, xã Phú Đình. Thác ở không xa các di tích Tỉn Keo, đồi Phong Tướng, lán Khuôn Tát, nhà trưng bày ATK Định Hóa, nhà tưởng niệm Chủ tịch Hồ Chí Minh tại ATK Định Hóa.\n" +
                    "\n" +
                    "Nơi đầu nguồn suối Tỉn Keo, giữa đỉnh núi nhiều cây cổ thụ, một dòng nước ào ào đổ xuống các bậc đá tạo nên dòng thác bạc bảy tầng. Tầng thác dưới cùng khoảng 12m, đổ vào một vũng lớn, mỗi chiều gần 10m, sâu tới 2m, nước trong vắt tạo ra một nơi bơi lội lí tưởng. Ngay giữa chiều hè, chỉ cần vào cách chân thác chừng 50m, ta đã có cảm giác mát lạnh. Thác Khuôn Tát, khu vực đầu nguồn suối Tỉn Keo thật là nơi lý tưởng để du ngoạn, bơi lội, cắm trại, dã ngoại.", "thackhuontat", 21.793629, 105.511480);

            db.insertDD("Đồi chè Tân Cương", "Với 20 ngàn ha chè chuyên canh trên toàn tỉnh thì có tới 17 ngàn ha là chè đặc sản. Những đồi chè ngút ngàn xanh mướt của Thái Nguyên hôm nay không đơn thuần chỉ là sản phẩm thuần nông của vùng đồi núi Trung du Bắc bộ, mà đang dần từng bước trở thành sản phẩm du lịch, được du khách trong và ngoài nước yêu thích. Bạn không chỉ được ngắm nhìn thỏa thích trong hương trà thơm quyến rũ mà còn được trải nghiệm khi hóa thân thành những người trồng chè thoăn thoắt hái những búp chè xanh non cho đến khi nặng cái gùi sau lưng, bạn sẽ được mang về nơi chế biến để thử làm một nghệ nhân chế biến trà: từ làm héo, vò, sao chè, rồi tự tay mình làm ra những búp chè quăn tít, ngào ngạt hương. Bạn sẽ cảm hết được cái gian khó lao động từ những búp chè bé tí và vị chát ngọt ngào của chúng, sâu lắng biết nhường nào. Thái Nguyên có tới chín vùng trà, mỗi vùng đều có những nét đặc trưng riêng, từ trồng, thu hoạch đến chế biến và đặc biệt là hương vị trong phẩm cấp trà của mỗi vùng đều khác nhau…\n" +
                    "\n" +
                    "Nằm cách trung tâm thành phố Thái Nguyên khoảng 10km về phía Tây Nam, Tân Cương được thiên nhiên ban tặng khung cảnh thiên nhiên thơ mộng. Những gốc chè được trồng trên những ngọn đồi thoai thoải, hướng về phía mặt trời mọc để có thể hấp thụ những tinh hoa của khí trời. Nhìn từ xa, những đồi chè như những con thằn lằn khổng lồ, hiền lành đang phơi mình dưới cái nắng vàng của Bắc Bộ. Có lẽ vì thế mà những ngọn đồi ở đây được người dân đặt tên là đồi Thằn Lằn.", "doichetancuong", 21.532229, 105.764332);
            db.insertDD("Hồ Suối Lạnh", "Nằm dưới chân núi Hàm Lợn của dãy núi Tam Đảo, hồ Suối Lạnh thuộc xã Thành Công, huyện Phổ Yên, tiếp giáp với Sóc Sơn, Hà Nội. Hồ với diện tích gần 50 ha, có suối nước trong, có đồi núi, rừng cây tạo cảnh quan non xanh, rất phù hợp để phát triển du lịch nghỉ dưỡng.", "hosuoilanh", 21.405494, 105.772482);
            db.insertDD("Hồ Vai Miễu", "Nằm dưới chân dãy núi Tam Đảo với diện tích 40 ha, hồ có nhiều đảo đẹp và cảnh quan thiên nhiên hoang sơ. Hồ cũng nằm gần khu di tích lịch sử Núi Văn – Núi Võ nên khá phù hợp với các hoạt động du lịch cắm trại nghỉ dưỡng.", "hovaimieu", 21.530091, 105.645609);
            db.insertDD("Hồ Ghềnh Chè", "Hồ Ghềnh Chè thuộc xã Bình Sơn, Tp Sông Công có diện tích 40 ha, được bao quanh bởi những cánh rừng bạch đàn, rừng mỡ bạt ngàn. Do cảnh quan đẹp, không khí trong lành, lại không xa trung tâm Sông Công và Thái Nguyên nên gần đây hồ Ghềnh Chè thu hút được nhiều khách du lịch đến câu cá.", "hoghenhtre", 21.508610, 105.771460);
            db.insertDD("Thác Nặm Rứt", "Thác Nặm Rứt trong tiếng Tày có nghĩa là thác Mưa Rơi. Thác ở cách trung tâm Tp Thái Nguyên khoảng 35km và nằm trên đường từ La Hiên (km 18 QL 1B) vào khu dích khảo cổ học Thần Sa.\n" +
                    "\n" +
                    "Vào mùa mưa, giữa vùng rừng núi non hùng vĩ, trên đỉnh một núi đá vôi có nhiều cây rừng, những dòng nước trắng xóa đổ xuống dòng sông Nghinh Tường tạo nên thác lớn. Vào mùa khô, nước chỉ đủ để ngấm qua những mảng rêu trên vách đá, rơi xuống dòng sông xanh tạo sự lấp lánh khắp mặt sông dưới ánh nắng vàng.", "thacmuaroinamrut", 21.788951, 105.916011);
            db.insertDD("Hang Phượng Hoàng – Suối Mỏ Gà", "Nằm bên trái QL 1B Thái Nguyên – Lạng Sơn (km 42) trên một núi đá lớn của dãy Phượng Hoàng thuộc xã Phú Thượng huyện Võ Nhai.\nNằm ở độ cao khoảng 500m so với chân núi, Phượng Hoàng là một hang động casto rộng lớn với vẻ đẹp kỳ lạ. Trong hang không khí trong lành, mát rượi. Đáy hang có nước trong veo, lại có những bờ cát trắng mịn ven bờ nước. Trong lòng hàng, rất nhiều những nhũ đá được thiên nhiên tạo thành những cột chống trời, mẹ bồng con, vũ nữ, voi chầu… rất đẹp. Chính giữa lòng hang là khối nhũ đá khổng lồ hình chim phượng hoàng trong tư thế giương cánh oai hùng. Khối nhũ này cũng chính là duyên cớ để hang có tên là Phượng Hoàng và được thêu dệt nên câu chuyện cổ tích về mối tình chung thủy hóa đá của đôi chim Phượng Hoàng thủa xưa.\n" +
                    "\n" +
                    "Ngay chân núi Phượng Hoàng là dòng suối Mỏ Gà chảy giữa lòng hang và trong vắt, mát lạnh. Do hang khá rộng và sâu, cửa hang nước đổ thành thác nước tung bọt trắng xóa giữa những khối đá lớn rồi đổ xuống cánh đồng Phú Thượng tạo nên cảnh quan sơn thủy hữu tình.", "hangphuonghoang", 21.779497, 106.117845);
            db.insertDD("Suối Cửa Tử", "Suối Cửa Tử nằm cách trung tâm thành phố Thái Nguyên khoảng 45 km, thuộc xã Hoàng Nông, huyện Đại Từ. Xã nằm ở phía tây của huyện và thuộc vùng núi Tam Đảo, tiếp giáp với đỉnh cao nhất của dãy núi này (1.590 m). Đây cũng là xã ngã ba ranh giới giữa ba tỉnh Thái Nguyên, Vĩnh Phúc và Tuyên Quang. Một dòng suối chảy từ dãy Tam Đảo xuống, dọc theo chiều dài của xã rồi đổ vào sông Công, đó là Cửa Tử.\n" +
                    "\n" +
                    "Xã Hoàng Nông có địa hình tương đối phức tạp. Đồi núi có độ dốc lớn. Xen kẽ đồi núi là những dải đồng bằng nhỏ hẹp với cánh đồng rau màu, và thửa ruộng bậc thang đẹp mắt nằm ngay trung tâm của xã, cùng với đó là hệ thống ao, hồ, đập chắn giữ nước nằm rải rác ở các xó.Cửa Tử thực chất là một con suối trải dài, hấp dẫn những bạn trẻ ưa khám phá bởi sự hoang sơ, thất thường của dòng suối. Người dân bản địa sống gần con suối này cho biết, sở dĩ gọi là Cửa Tử bởi vì ở đây chỉ có duy nhất một đường lên xuống. Nước suối lại cao thấp thất thường theo lượng mưa, nên ít người có thể khám phá hết con suối. Nằm lọt thỏm giữa những ngọn núi cao vút, dòng suối như một con rắn uốn mình trườn đi.\nHiện nay Cửa Tử thu hút được rất nhiều bạn trẻ đến quanh năm, vào mùa hè các hoạt động lội suối, chinh phục thác, bơi lội là những hoạt động phổ biến. Vào mùa đông, Cửa Tử cũng có một biển mây đang vẫy gọi các bạn thích leo núi.", "suoicuatu", 21.617924, 105.561806);
            db.insertDD("Chùa Hang", "Chùa Hang nằm ngay trung tâm thị trấn Chùa Hang, Đồng Hỷ, cách trung tâm Tp Thái Nguyên khoảng 2km.\nChùa Hang còn được gọi là “Tiên Lữ Phật Động”, tên chữ là “Kim Sơn Tự”. Di tích thắng cảnh Chùa Hang có ba ngọn núi đá lớn, độc lập trên vùng đất bằng phẳng… Ngọn núi đứng giữa có tên là “Huyền Vũ” cao to vững trãi, hai bên là hai ngọn “Thanh Long – Bạch Hổ” vươn cao uy nghi, ba ngọn kết nối nhau bởi dải yên ngựa chừng 1000m có diện tích chân núi chừng 2,7ha.\n" +
                    "\n" +
                    "Núi Chùa Hang xưa gọi là núi đá Hóa Trung (núi Long Tuyền), động Chùa Hang còn gọi là động Tiên Lữ, có nhiều nhũ đá đẹp, trong động thờ Phật. Trên vách đá của động hiện có câu đối cổ bằng chữ Hán\n" +
                    "\n" +
                    "Phong cảnh thiên nhiên duy đệ nhất\n" +
                    "Danh lam nhân tạo thị vô song\n" +
                    "\n" +
                    "Tạm dịch:\n" +
                    "\n" +
                    "Phong cảnh thiên nhiên đẹp vào bậc nhất\n" +
                    "Danh lam do con người tạo cũng không gì sánh được", "chuahang", 21.633233, 105.832804);
            db.insertDD("Đền Đuổm – Núi Đuổm", "Núi Đuổm, xưa gọi là Điểm Sơn, nằm kề quốc lộ 3, cách trung tâm thành phố Thái Nguyên 24 km về phía Tây – Bắc. Sách Đại Nam Nhất Thống Chí xếp Điểm Sơn là danh thắng của đất Thái Nguyên và tả: “ Điểm Sơn… phía trước núi có phiến đá chỗ lên chỗ xuống như con rồng ngóc đầu, phía dưới có hai phiến đá lớn như hình hai con voi chầu vào. Đỉnh núi và sườn núi đều có đền”.\n" +
                    "\n" +
                    "Từ xa nhìn vào, Núi Đuổm với sáu ngọn núi đá tựa sáu đầu rồng. Ngọn ở phía cực Đông như mọc ra một “tháp đá” chọc thẳng lên trời xanh. Các vách đá thẳng đứng, rêu phong cổ kính. Quanh núi, nhiều cây cổ thụ đường kính gốc hơn một mét.\n" +
                    "\n" +
                    "Dưới chân núi, phía Đông Bắc, có đền thờ nổi tiếng linh thiêng thờ danh nhân Dương Tự Minh – Thủ lĩnh phủ Phú Lương, Phò mã hai đời vua nhà Lý, có nhiều công lao bảo vệ vững chắc miền biên cương phía bắc quốc gia Đại Việt (đền Trung) và hai nàng công chúa Diên Bình và Thiều Dung vợ ông (đền Hạ), thân mẫu của ông (đền Thượng).", "canhdongduom", 21.754766, 105.706083);
            db.insertDD("Thác Đát Đắng", "Đát Đắng thuộc xã Phú Xuyên, huyện Đại Từ, tỉnh Thái Nguyên. Từ trung tâm thành phố Thái Nguyên theo quốc lộ 37 nối giữa Thái Nguyên và Tuyên Quang du khách mất khoảng một giờ đồng hồ đi xe máy đến xã Phú Xuyên rồi đi tiếp hơn 2 km đường mòn chạy tới gần chân đát. Sau khi gửi xe và bách bộ khoảng 2 km băng qua những con suối, những bãi đá lởm chởm, những ngọn đồi xanh cỏ, thác Đát Đắng hiện ra tầng tầng, lớp lớp chắc chắn sẽ không phụ công sức của những vị khách đam mê du lịch và khám phá.\nĐát Đắng khá xa đường quốc lộ, chính vì thế mà điểm hấp dẫn của nơi này chính là cảm giác được hòa mình vào thiên nhiên, được đắm chìm trong những cánh rừng nguyên sinh xanh mướt, trong một bầu không khí trong lành, mát mẻ, và những dòng thác tuôn chảy.", "datdang", 21.643812, 105.518173);
            db.insertDD("Suối Tiên", "Suối Tiên thuộc xóm Tân Lập II, xã Văn Lăng, huyện Đồng Hỷ, tỉnh Thái Nguyên; cách trung tâm thành phố Thái Nguyên khoảng 30km về phía bắc. Từ trung tâm thành phố Thái nguyên theo quốc lộ 1B đến km số 7 rẽ trái đường đi Hòa Bình, qua địa phận xã Hòa Bình đến xã Văn Lăng, suối cách trung tâm xã 2km (có biển chỉ dẫn).\n" +
                    "\n" +
                    "Trước đây suối có tên là Đát Khe Đậy nhưng sau này do khách du lịch đến đây ngày một nhiều, trước vẻ đẹp ngỡ ngàng, thiên tạo như vậy họ liên tưởng nơi đây có lẽ đã từng là điểm đến của các nàng tiên để du ngoạn và tắm mát nên đặt tên là Suối Tiên. Những người dân ở đây cũng không còn nhớ cái tên Suối Tiên này đã có từ lúc nào và dần đi vào tiềm thức của họ.", "suoitien", 21.815507, 105.829152);
            db.insertDD("Đình Phương Độ", "Đình Phương Độ thuộc làng Phương Độ, xã Xuân Phương, huyện Phú Bình, tỉnh Thái Nguyên. Đình Phương Độ được xây dựng vào thế kỷ 15 thờ Đức thánh Dương Tự Minh.\nĐình Phương Độ là một di tích mang đặc trưng của kiến trúc thời Lê, với mái đình được làm bằng ngói mũi, bốn góc cong vút ẩn hiện dưới tán cây đa cổ thụ. Gác chuông được xây 3 tầng, trước cổng đình là ao bán nguyệt. Đình được dựng lên bởi 48 cột lim có đường kính 0,3-0,5m. Bốn góc đình được thiết kế hình mũi cong tạo cho đình một vẻ đẹp thanh thoát nhẹ nhàng. Trên mái đình được trang trí theo kiểu “Lưỡng long chầu nguyệt”. Ở trong đình, trên – dưới các đầu trụ, đầu cầu và các xà ngang, xà dọc đều được trang trí hoa văn, chạm trổ các bộ “Tứ linh” (Long –Ly – Quy – Phượng) rất khéo léo, công phu.\n" +
                    "\n" +
                    "Gian chính của đình là nơi đặt điện thờ gồm: Một bàn hương án trang trọng lộng lẫy gọi là Thượng Cung Đình. Trên Thượng Cung Đình có Cửa Vọng được sơn son thiếp vàng. Phía trong Nội Cung đặt tượng đức thánh Dương Tự Minh tạc bằng gỗ hình nổi. Bên tả và bên hữu của bàn hương án là bộ “Hạc đứng lưng Quy” thể hiện cho sức mạnh và sự chiến thắng. Trong gian chính còn có câu đối, các bức tranh, bộ bát cửu…được bố trí hài hoà làm tôn thêm vẻ uy nghiêm của ngôi đình.\n" +
                    "\n" +
                    "Trong đình hiện vẫn còn lưu giữ các hiện vật có giá trị như: Một sắc phong và 2 bức Đại tự thờ Dương Tự Minh thời Khải Định; Bàn hương án của cuối thời lê Đầu Thời nguyễn; Bát hương sành cổ (thời Lê); Hai cây nến đồng cao 0,8m (thời Lê) và các đồ vật quý như: Kiệu, bát hương, hương án…được trang trí và trạm trổ hoa văn tinh tế.", "dinhphuongdo", 21.455011, 105.951135);


        }

    }
    public List<data_map> getdata(){
        List<data_map> data=new ArrayList<>();
        DB db = new DB(context);
        db.open();
        if(db.checkCount()>0){
            data=db.getall();
        }
        db.close();
        return data;
    }
}
