
package com.example.myapplication.util;

import android.content.Context;


import com.example.myapplication.model.data_map;
import com.example.myapplication.view.DB;

import java.util.ArrayList;
import java.util.List;

public class PutDataHot {
    private Context context;

    public PutDataHot(Context context) {

        this.context = context;
        DB db = new DB(context);


        db.open();

        if (db.checkCountHot() <= 0) {
            db.insertDDHot("Đồi chè Tân Cương", "Với 20 ngàn ha chè chuyên canh trên toàn tỉnh thì có tới 17 ngàn ha là chè đặc sản. Những đồi chè ngút ngàn xanh mướt của Thái Nguyên hôm nay không đơn thuần chỉ là sản phẩm thuần nông của vùng đồi núi Trung du Bắc bộ, mà đang dần từng bước trở thành sản phẩm du lịch, được du khách trong và ngoài nước yêu thích. Bạn không chỉ được ngắm nhìn thỏa thích trong hương trà thơm quyến rũ mà còn được trải nghiệm khi hóa thân thành những người trồng chè thoăn thoắt hái những búp chè xanh non cho đến khi nặng cái gùi sau lưng, bạn sẽ được mang về nơi chế biến để thử làm một nghệ nhân chế biến trà: từ làm héo, vò, sao chè, rồi tự tay mình làm ra những búp chè quăn tít, ngào ngạt hương. Bạn sẽ cảm hết được cái gian khó lao động từ những búp chè bé tí và vị chát ngọt ngào của chúng, sâu lắng biết nhường nào. Thái Nguyên có tới chín vùng trà, mỗi vùng đều có những nét đặc trưng riêng, từ trồng, thu hoạch đến chế biến và đặc biệt là hương vị trong phẩm cấp trà của mỗi vùng đều khác nhau…",
                    "Nằm cách trung tâm thành phố Thái Nguyên khoảng 10km về phía Tây Nam, Tân Cương được thiên nhiên ban tặng khung cảnh thiên nhiên thơ mộng. Những gốc chè được trồng trên những ngọn đồi thoai thoải, hướng về phía mặt trời mọc để có thể hấp thụ những tinh hoa của khí trời. Nhìn từ xa, những đồi chè như những con thằn lằn khổng lồ, hiền lành đang phơi mình dưới cái nắng vàng của Bắc Bộ. Có lẽ vì thế mà những ngọn đồi ở đây được người dân đặt tên là đồi Thằn Lằn.", "doichetancuong", "doichetancuong2", "doichetancuong3", 21.532229, 105.764332);
            db.insertDDHot("Hồ Suối Lạnh", "Nằm dưới chân núi Hàm Lợn của dãy núi Tam Đảo, hồ Suối Lạnh thuộc xã Thành Công, huyện Phổ Yên, tiếp giáp với Sóc Sơn, Hà Nội. Hồ với diện tích gần 50 ha, có suối nước trong, có đồi núi, rừng cây tạo cảnh quan non xanh, rất phù hợp để phát triển du lịch nghỉ dưỡng.", "", "hosuoilanh", "hosuoilanh2", "hosuoilanh3", 21.405494, 105.772482);
            db.insertDDHot("Đền Đuổm – Núi Đuổm", "Núi Đuổm, xưa gọi là Điểm Sơn, nằm kề quốc lộ 3, cách trung tâm thành phố Thái Nguyên 24 km về phía Tây – Bắc. Sách Đại Nam Nhất Thống Chí xếp Điểm Sơn là danh thắng của đất Thái Nguyên và tả: “ Điểm Sơn… phía trước núi có phiến đá chỗ lên chỗ xuống như con rồng ngóc đầu, phía dưới có hai phiến đá lớn như hình hai con voi chầu vào. Đỉnh núi và sườn núi đều có đền”.\n" +
                    "\n" +
                    "Từ xa nhìn vào, Núi Đuổm với sáu ngọn núi đá tựa sáu đầu rồng. Ngọn ở phía cực Đông như mọc ra một “tháp đá” chọc thẳng lên trời xanh. Các vách đá thẳng đứng, rêu phong cổ kính. Quanh núi, nhiều cây cổ thụ đường kính gốc hơn một mét.\n" +
                    "\n" +
                    "Dưới chân núi, phía Đông Bắc, có đền thờ nổi tiếng linh thiêng thờ danh nhân Dương Tự Minh – Thủ lĩnh phủ Phú Lương, Phò mã hai đời vua nhà Lý, có nhiều công lao bảo vệ vững chắc miền biên cương phía bắc quốc gia Đại Việt (đền Trung) và hai nàng công chúa Diên Bình và Thiều Dung vợ ông (đền Hạ), thân mẫu của ông (đền Thượng).", "Truyền thuyết núi Đuổm và Dương Tự Minh ghi công trạng của ông - người anh hùng đã được nhân dân truyền tụng và sống trong lòng nhân dân các dân tộc suốt mấy trăm năm nay. Hàng năm lễ hội Đền Đuổm được tổ chức vào mùng 6 tháng giêng (âm lịch) Lễ hội gồm phần Lễ và phần hội. Khu vực trước của của đền chính là sân tổ chức lễ hội, trong sân hội có Hồ Bán Nguyệt, trên hồ là Thuỷ Đình nơi thờ mẫu mẹ Thập Điện Long Cung. Khu vực sân rộng lớn với các trò chơi dân gian như: kéo co, tung còn, đẩy gậy, ném lao…và đặc biệt là leo núi ngoạn cảnh thu hút được hàng vạn du khách thập phương về trẩy hội.", "canhdongduom", "canhdongduom2", "canhdongduom3", 21.754766, 105.706083);
            db.insertDDHot("Khu di tích ATK Định Hóa", "Chúng ta đã từng biết đến một Thái Nguyên xanh với cái màu xanh thẫm trải dài theo những cánh rừng cọ, đồi chè bát ngát; màu xanh mướt của thảm cỏ, nương ngô; xen lẫn với cái xanh dương sẫm của những luỹ tre ẩn mình trong các thôn xóm, bản làng. Và bây giờ, chúng ta còn biết đến một Thái Nguyên anh hùng với những khu di tích cách mạng nổi tiếng. Một trong những khu di tích phải kể đến đó là Trung tâm ATK (an toàn khu) nằm ở xã Phú Đình, huyện Đình Hoá, tỉnh Thái Nguyên, là nơi Chủ tịch Hồ Chí Minh và các vị lãnh đạo Đảng, Nhà nước đã sống và làm việc từ 1947 - 1954 để lãnh đạo cuộc kháng chiến chín năm chống thực dân Pháp. Điểm di tích lịch sử ATK đã được Nhà nước xếp hạng quốc gia năm 1981.", "Bên cạnh các di tích chính như đồi Tỉn Keo, Khuôn Tát, Nà Nom... cụm di tích ATK còn nhiều địa đanh di vào lịch sử: đèo De, núi Hồng,... bên cạnh những rừng cọ, đồi chè, chắn nước, dòng suối trong xanh. Theo hành trình du lịch về phía Nam của tỉnh Thái Nguyên, du khách sẽ đến khu ATK, nằm trọn trong xã Kha Sơn, huyện Phú Bình, đi thăm những địa danh và tên tuổi đã được ghi vào lịch sử: nhà ông Cao Nhật, một trong những cơ sở cách mạng đầu tiên của Xứ ủy Bắc Kì thời kì 1939t- 1945, rừng Mấn - nơi đặt trạm liên lạc của Xứ ủy Bắc Kì và là nơi mở lớp huấn luyện chính trị, quân sự của Đảng, đồng chí Trường Chinh, Tổng bí thư của Đảng khi đó và đồng chí Hoàng Quốc Việt từng qua lại hoạt động ở đây, chùa Mai Sơn - nơi Xứ ủy Bắc Kì đặt nhà in đặc biệt, in báo Cờ giải phóng và nhiều tài liệu quan trọng, đình Kha Sơn - nơi thành lập chính quyền cách mạng đầu tiên của xã... Tất cả những di tích lịch sử này đều đã được xếp hạng quốc gia. ", "atkdinhhoa", "atkdinhhoa2", "atkdinhhoa3", 21.7943619, 105.5074278);

            db.insertDDHot("Thác Nặm Rứt", "Thác Nặm Rứt trong tiếng Tày có nghĩa là thác Mưa Rơi. Thác ở cách trung tâm Tp Thái Nguyên khoảng 35km và nằm trên đường từ La Hiên (km 18 QL 1B) vào khu dích khảo cổ học Thần Sa.\n" +
                    "\n" +
                    "Vào mùa mưa, giữa vùng rừng núi non hùng vĩ, trên đỉnh một núi đá vôi có nhiều cây rừng, những dòng nước trắng xóa đổ xuống dòng sông Nghinh Tường tạo nên thác lớn. Vào mùa khô, nước chỉ đủ để ngấm qua những mảng rêu trên vách đá, rơi xuống dòng sông xanh tạo sự lấp lánh khắp mặt sông dưới ánh nắng vàng.", "Dưới ánh sáng mặt trời, cả dòng thác được khúc xạ thành vô số những cầu vồng đủ màu sắc chiếu rọi xuống dòng sông Thần Sa trong xanh. Tiếng nước réo rắt giao hòa với âm hưởng vang vọng của vách đá tạo thành một bản nhạc rừng khá thú vị.", "thacmuaroinamrut", "thacmuaroinamrut2", "thacmuaroinamrut3", 21.788951, 105.916011);
            db.insertDDHot("Hang Phượng Hoàng – Suối Mỏ Gà", "Nằm bên trái QL 1B Thái Nguyên – Lạng Sơn (km 42) trên một núi đá lớn của dãy Phượng Hoàng thuộc xã Phú Thượng huyện Võ Nhai.\nNằm ở độ cao khoảng 500m so với chân núi, Phượng Hoàng là một hang động casto rộng lớn với vẻ đẹp kỳ lạ. Trong hang không khí trong lành, mát rượi. Đáy hang có nước trong veo, lại có những bờ cát trắng mịn ven bờ nước. Trong lòng hàng, rất nhiều những nhũ đá được thiên nhiên tạo thành những cột chống trời, mẹ bồng con, vũ nữ, voi chầu… rất đẹp. Chính giữa lòng hang là khối nhũ đá khổng lồ hình chim phượng hoàng trong tư thế giương cánh oai hùng. Khối nhũ này cũng chính là duyên cớ để hang có tên là Phượng Hoàng và được thêu dệt nên câu chuyện cổ tích về mối tình chung thủy hóa đá của đôi chim Phượng Hoàng thủa xưa.\n"
                    , "Ngay chân núi Phượng Hoàng là dòng suối Mỏ Gà chảy giữa lòng hang và trong vắt, mát lạnh. Do hang khá rộng và sâu, cửa hang nước đổ thành thác nước tung bọt trắng xóa giữa những khối đá lớn rồi đổ xuống cánh đồng Phú Thượng tạo nên cảnh quan sơn thủy hữu tình.", "hangphuonghoang", "hangphuonghoang2", "hangphuonghoang3", 21.779497, 106.117845);
            db.insertDDHot("Suối Cửa Tử", "Suối Cửa Tử nằm cách trung tâm thành phố Thái Nguyên khoảng 45 km, thuộc xã Hoàng Nông, huyện Đại Từ. Xã nằm ở phía tây của huyện và thuộc vùng núi Tam Đảo, tiếp giáp với đỉnh cao nhất của dãy núi này (1.590 m). Đây cũng là xã ngã ba ranh giới giữa ba tỉnh Thái Nguyên, Vĩnh Phúc và Tuyên Quang. Một dòng suối chảy từ dãy Tam Đảo xuống, dọc theo chiều dài của xã rồi đổ vào sông Công, đó là Cửa Tử."
                    , "\"Xã Hoàng Nông có địa hình tương đối phức tạp. Đồi núi có độ dốc lớn. Xen kẽ đồi núi là những dải đồng bằng nhỏ hẹp với cánh đồng rau màu, và thửa ruộng bậc thang đẹp mắt nằm ngay trung tâm của xã, cùng với đó là hệ thống ao, hồ, đập chắn giữ nước nằm rải rác ở các xó.Cửa Tử thực chất là một con suối trải dài, hấp dẫn những bạn trẻ ưa khám phá bởi sự hoang sơ, thất thường của dòng suối. Người dân bản địa sống gần con suối này cho biết, sở dĩ gọi là Cửa Tử bởi vì ở đây chỉ có duy nhất một đường lên xuống. Nước suối lại cao thấp thất thường theo lượng mưa, nên ít người có thể khám phá hết con suối. Nằm lọt thỏm giữa những ngọn núi cao vút, dòng suối như một con rắn uốn mình trườn đi.\\nHiện nay Cửa Tử thu hút được rất nhiều bạn trẻ đến quanh năm, vào mùa hè các hoạt động lội suối, chinh phục thác, bơi lội là những hoạt động phổ biến. Vào mùa đông, Cửa Tử cũng có một biển mây đang vẫy gọi các bạn thích leo núi.", "suoicuatu", "suoicuatu2", "suoicuatu3", 21.617924, 105.561806);
            db.insertDDHot("Chùa Hang", "Chùa Hang nằm ngay trung tâm thị trấn Chùa Hang, Đồng Hỷ, cách trung tâm Tp Thái Nguyên khoảng 2km.\nChùa Hang còn được gọi là “Tiên Lữ Phật Động”, tên chữ là “Kim Sơn Tự”. Di tích thắng cảnh Chùa Hang có ba ngọn núi đá lớn, độc lập trên vùng đất bằng phẳng… Ngọn núi đứng giữa có tên là “Huyền Vũ” cao to vững trãi, hai bên là hai ngọn “Thanh Long – Bạch Hổ” vươn cao uy nghi, ba ngọn kết nối nhau bởi dải yên ngựa chừng 1000m có diện tích chân núi chừng 2,7ha.\n" +
                    "\n" +
                    "Núi Chùa Hang xưa gọi là núi đá Hóa Trung (núi Long Tuyền), động Chùa Hang còn gọi là động Tiên Lữ, có nhiều nhũ đá đẹp, trong động thờ Phật. Trên vách đá của động hiện có câu đối cổ bằng chữ Hán\n" +
                    "\n" +
                    "Phong cảnh thiên nhiên duy đệ nhất\n" +
                    "Danh lam nhân tạo thị vô song\n" +
                    "\n" +
                    "Tạm dịch:\n" +
                    "\n" +
                    "Phong cảnh thiên nhiên đẹp vào bậc nhất\n" +
                    "Danh lam do con người tạo cũng không gì sánh được", "Hàng năm, từ ngày 19 đến ngày 21 tháng giêng âm lịch, diễn ra lễ hội Chùa Hang ở Thái Nguyên nhằm tạ ơn trời đất, cầu cho mưa thuận gió hòa, bản làng ấm no, cây cối tốt tươi, đâm chồi nẩy lộc. Phần lễ gồm dâng hương, rước kiệu, tạ ơn các vị thần đất, thần sông, thần suối... Phần hội có các trò chơi dân gian đặc sắc như: tung còn, đi cầu kiều, bắn cung, đẩy gậy, bắt trạch trong chum, chọi gà, tung vòng cổ vịt ... cùng các tiết mục văn nghệ, liên hoan văn hóa trà…\n" +
                    "\n" +
                    "Ngày 26/2/1999, chùa Hang Thái Nguyên đã được công nhận là Di tích Lịch sử - Văn hóa, Danh lam thắng cảnh cấp Quốc gia.", "chuahang", "chuahang2", "chuahang3", 21.633233, 105.832804);
            db.insertDDHot("Suối Tiên", "Suối Tiên thuộc xóm Tân Lập II, xã Văn Lăng, huyện Đồng Hỷ, tỉnh Thái Nguyên; cách trung tâm thành phố Thái Nguyên khoảng 30km về phía bắc. Từ trung tâm thành phố Thái nguyên theo quốc lộ 1B đến km số 7 rẽ trái đường đi Hòa Bình, qua địa phận xã Hòa Bình đến xã Văn Lăng, suối cách trung tâm xã 2km (có biển chỉ dẫn).\n" +
                    "\n" +
                    "Trước đây suối có tên là Đát Khe Đậy nhưng sau này do khách du lịch đến đây ngày một nhiều, trước vẻ đẹp ngỡ ngàng, thiên tạo như vậy họ liên tưởng nơi đây có lẽ đã từng là điểm đến của các nàng tiên để du ngoạn và tắm mát nên đặt tên là Suối Tiên. Những người dân ở đây cũng không còn nhớ cái tên Suối Tiên này đã có từ lúc nào và dần đi vào tiềm thức của họ.", "Suối Tiên có lẽ cũng giống như vô vàn những con suối khác ở dòng nước trong vắt trườn lên lớp cát trắng phau, những con ốc nhỏ bám chặt vào tảng đá xanh rêu. Nhưng suối Tiên không giống những con suối thông thường ở chỗ có nhiều ghềnh đá dềnh lên mặt nước như lưng những chú voi khổng lồ, có những đoạn nước chảy trông giống như chú cá với những chiếc vẩy khổng lồ đang trườn đi. Đi dọc con suối tôi rất ấn tượng bởi một loài cây mọc rất nhiều trên những ghềnh đá. Hỏi anh Tuấn - người dẫn đường thì được biết đây là loài cây Dọc Mạ. Cây này thường mọc ở những lạch khe mát trên những ghềnh đá. Người dân địa phương thường lấy cây này về đốt, chắt nước để làm bánh nẳng có mùi thơm ngon đặc trưng. Vào dịp cuối xuân, đầu hè đến đây, ta sẽ cảm nhậ được một không gian vàng rực hoa Dọc Mạ. Một khung cảnh thật thơ mộng.", "suoitien", "suoitien2", "suoitien3", 21.815507, 105.829152);
            db.insertDDHot("Hồ Núi Cốc", "Hồ ở phía nam huyện Đại Từ, cách trung tâm thành phố Thái Nguyên khoảng 15km về phía tây, là một thắng cảnh thiên nhiên gắn liền với câu chuyện tình huyền thoại về chàng Cốc nàng Công. \nTrong cái mênh mang của mây trời, sông nước; trong cái ngút ngàn mướt xanh của những vạt rừng in bóng mặt hồ; rồi 89 hòn đảo mang những cái tên thật khêu gợi: Đảo Tiên Nằm, đảo Núi Cái, đảo Cò, đảo Dê, đảo Khỉ… và xa xa phía tây, dãy Tam Đảo sừng sững như một bức trường thành lam sẫm… thật khó dùng lời để tả hết vẻ đẹp, sự quyến rũ của hồ Núi Cốc – hồ huyền thoại. Đến với hồ Núi Cốc là đến với một thắng cảnh “sơn thủy hữu tình”; đến với không khí trong lành, mát mẻ; để du ngoạn trên hồ và đắm mình trong câu chuyện tình chung thủy ngàn đời trở thành huyền thoại của vùng sơn cước.\n"
                    ,
                    "Hồ Núi Cốc nguyên là một đoạn của sông Công, một trong các chi lưu của sông Cầu chảy vòng quanh một ngọn núi đất có tên là núi Cốc. Đập Núi Cốc được khởi công xây dựng đầu năm 1972 nhưng do Không quân Mỹ mở chiến dịch Linebacker I đánh phá trở lại miền Bắc Việt Nam nên công trình bị đình hoãn đến đầu năm 1973 mới tái khởi động. Tháng 10 năm 1978, một trận lũ lịch sử trên sông Công có lưu lượng 3.000 mét khối/giây, gấp gần 4 lần lưu lượng xả thiết kế của cửa xả chính và làm vỡ hai vai đập. Công trình Đập Núi Cốc hoàn thành phần đầu mối vào năm 1979 và hoàn thành toàn bộ vào năm 1982.", "honuicoc", "honuicoc2", "honuicoc3", 21.5915399, 105.6850559);


            db.close();
        }


    }

    public List<data_map> getData() {
        List<data_map> data = new ArrayList<>();
        DB db = new DB(context);

        db.open();
        if (db.checkCountHot() > 0) {

            data = db.getAllHot();


        }
        db.close();

        return data;
    }
}
