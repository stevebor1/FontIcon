package com.porotype.iconfont;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.server.Resource;

/**
 * Enables you to easily use the <a
 * href="http://fortawesome.github.io/Font-Awesome">FontAwesome</a> icon font to
 * easily embed scalable icons in any component that supports HTML content,
 * anywhere in said content. The icons are actually fonts, so the scale, and can
 * be colored, just as the rest of the text.
 * <p>
 * By default, {@link #load()} uses a CDN is used to host the font and CSS
 * "from the cloud", so you can very quickly get up-and-running. <br/>
 * For production, you might want to generate an optimized font w/o unused
 * icons, for instance using the <a href="http://icomoon.io/app/">IconMoon</a>
 * app. Deploy your icon-font (for instance in your theme) and point
 * {@link FontAwesome} to the CSS with {@link #load(Resource)}, e.g
 * <code>FontAwesome.load(new ThemeResource("font-awesome/css/font-awesome.min.css"));</code>
 * </p>
 * 
 * @see http://fortawesome.github.io/Font-Awesome
 * @see http://fortawesome.github.io/Font-Awesome/#license
 * @see http://icomoon.io
 * @see http://cdnjs.com
 * @author marc
 * 
 */
public class FontAwesome {

    public static final String CDN = "//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css";

    public static void load() {
        load(new ExternalResource(CDN));
    }

    /**
     * Loads the FontAwesome CSS, and thus actual font, from the given location.
     * <p>
     * <code>
     * FontAwesome.load(new ThemeResource("font-awesome/css/font-awesome.min.css"));
     * </code>
     * </p>
     * 
     * @param fontAwesomeCss
     */
    public static void load(Resource fontAwesomeCss) {
        Page.getCurrent().getStyles().add(fontAwesomeCss);
    }

    /**
     * Icon variant; multiple can be used, but all combinations do not make
     * sense.
     * 
     * @author marc
     * 
     */
    public enum IconVariant {
        /**
         * A larger icon
         */
        SIZE_LARGE("fa-lg"),
        /**
         * 2x sized icon
         */
        SIZE_2X("fa-2x"),
        /**
         * 3x sized icon
         */
        SIZE_3X("fa-3x"),
        /**
         * 4x sized icon
         */
        SIZE_4X("fa-4x"),
        /**
         * 5x sized icon
         */
        SIZE_5X("fa-5x"),
        /**
         * Use fa-fw to set icons at a fixed width. 
         * Great to use when variable icon widths throw off alignment. 
         * Especially useful in things like nav lists.
         */
        FIXED_WIDTH("fa-fw"),
        /**
         * Use fa-ul and fa-li to easily replace default bullets in unordered lists.
         */
        LIST("fa-li"),
        /**
         * Spinning (animated) icon. Most useful with icons such as
         * {@link Icon#spinner}.
         */
        SPIN("fa-spin"),
        /**
         * Adds a border around the icon
         */
        BORDER("fa-border"),
        /**
         * For e.g for easy pull quotes or article graphics, with larger icons
         * next to text.
         */
        PULL_LEFT("pull-left"),
        /**
         * For e.g for easy pull quotes or article graphics, with larger icons
         * next to text.
         */
        PULL_RIGHT("pull-right"),
        /**
         * To arbitrarily rotate and flip icons, use the fa-rotate-* and fa-flip-* classes.
         */
        ROTATE_90("fa-rotate-90"),
        /**
         * 
         */
        ROTATE_180("fa-rotate-180"),
        /**
         * 
         */
        ROTATE_270("fa-rotate-270"),
        /**
         * 
         */
        FLIP_HORIZONTAL("fa-flip-horizontal"),
        /**
         * 
         */
        FLIP_VERTICAL("fa-flip-vertical"),
        /**
         * To stack multiple icons, use the fa-stack class on the parent, 
         * the fa-stack-1x for the regularly sized icon, and fa-stack-2x for the larger icon. 
         * fa-inverse can be used as an alternative icon color. 
         * You can even throw larger icon classes on the parent to get further control of sizing.
         */
        STACK("fa-stack"),
        /**
         * a-stack-1x for the regularly sized icon
         */
        STACK_1X("fa-stack-1x"),
        /**
         * fa-stack-2x for the larger icon
         */
        STACK_2X("fa-stack-2x"),
        /**
         * fa-inverse can be used as an alternative icon color
         */
        INVERSE("fa-inverse");
        

        private final String stylename;

        IconVariant(String stylename) {
            this.stylename = stylename;
        }

        @Override
        public String toString() {
            return stylename;
        }
    }

    /**
     * Font-Awesome icon.
     * <p>
     * The basic {@link #toString()} will produce HTML representing the regular
     * icon.<br/>
     * For variants, {@link #variant(IconVariant...)} can be used with one or
     * more {@link IconVariant}s.<br/>
     * For custom cases, the stylename is available via {@link #stylename()}.
     * </p>
     * <p>
     * Remember to {@link FontAwesome#load()} (or
     * {@link FontAwesome#load(Resource)}) first.
     * </p>
     * 
     * @author marc
     * 
     */
    public enum Icon {
    	glass("&#xf000;"),
    	music("&#xf001;"),
    	search("&#xf002;"),
    	envelope_o("&#xf003;"),
    	heart("&#xf004;"),
    	star("&#xf005;"),
    	star_o("&#xf006;"),
    	user("&#xf007;"),
    	film("&#xf008;"),
    	th_large("&#xf009;"),
    	th("&#xf00a;"),
    	th_list("&#xf00b;"),
    	check("&#xf00c;"),
    	remove("&#xf00d;"),
    	close("&#xf00d;"),
    	times("&#xf00d;"),
    	search_plus("&#xf00e;"),
    	search_minus("&#xf010;"),
    	power_off("&#xf011;"),
    	signal("&#xf012;"),
    	gear("&#xf013;"),
    	cog("&#xf013;"),
    	trash_o("&#xf014;"),
    	home("&#xf015;"),
    	file_o("&#xf016;"),
    	clock_o("&#xf017;"),
    	road("&#xf018;"),
    	download("&#xf019;"),
    	arrow_circle_o_down("&#xf01a;"),
    	arrow_circle_o_up("&#xf01b;"),
    	inbox("&#xf01c;"),
    	play_circle_o("&#xf01d;"),
    	rotate_right("&#xf01e;"),
    	repeat("&#xf01e;"),
    	refresh("&#xf021;"),
    	list_alt("&#xf022;"),
    	lock("&#xf023;"),
    	flag("&#xf024;"),
    	headphones("&#xf025;"),
    	volume_off("&#xf026;"),
    	volume_down("&#xf027;"),
    	volume_up("&#xf028;"),
    	qrcode("&#xf029;"),
    	barcode("&#xf02a;"),
    	tag("&#xf02b;"),
    	tags("&#xf02c;"),
    	book("&#xf02d;"),
    	bookmark("&#xf02e;"),
    	print("&#xf02f;"),
    	camera("&#xf030;"),
    	font("&#xf031;"),
    	bold("&#xf032;"),
    	italic("&#xf033;"),
    	text_height("&#xf034;"),
    	text_width("&#xf035;"),
    	align_left("&#xf036;"),
    	align_center("&#xf037;"),
    	align_right("&#xf038;"),
    	align_justify("&#xf039;"),
    	list("&#xf03a;"),
    	dedent("&#xf03b;"),
    	outdent("&#xf03b;"),
    	indent("&#xf03c;"),
    	video_camera("&#xf03d;"),
    	photo("&#xf03e;"),
    	image("&#xf03e;"),
    	picture_o("&#xf03e;"),
    	pencil("&#xf040;"),
    	map_marker("&#xf041;"),
    	adjust("&#xf042;"),
    	tint("&#xf043;"),
    	edit("&#xf044;"),
    	pencil_square_o("&#xf044;"),
    	share_square_o("&#xf045;"),
    	check_square_o("&#xf046;"),
    	arrows("&#xf047;"),
    	step_backward("&#xf048;"),
    	fast_backward("&#xf049;"),
    	backward("&#xf04a;"),
    	play("&#xf04b;"),
    	pause("&#xf04c;"),
    	stop("&#xf04d;"),
    	forward("&#xf04e;"),
    	fast_forward("&#xf050;"),
    	step_forward("&#xf051;"),
    	eject("&#xf052;"),
    	chevron_left("&#xf053;"),
    	chevron_right("&#xf054;"),
    	plus_circle("&#xf055;"),
    	minus_circle("&#xf056;"),
    	times_circle("&#xf057;"),
    	check_circle("&#xf058;"),
    	question_circle("&#xf059;"),
    	info_circle("&#xf05a;"),
    	crosshairs("&#xf05b;"),
    	times_circle_o("&#xf05c;"),
    	check_circle_o("&#xf05d;"),
    	ban("&#xf05e;"),
    	arrow_left("&#xf060;"),
    	arrow_right("&#xf061;"),
    	arrow_up("&#xf062;"),
    	arrow_down("&#xf063;"),
    	mail_forward("&#xf064;"),
    	share("&#xf064;"),
    	expand("&#xf065;"),
    	compress("&#xf066;"),
    	plus("&#xf067;"),
    	minus("&#xf068;"),
    	asterisk("&#xf069;"),
    	exclamation_circle("&#xf06a;"),
    	gift("&#xf06b;"),
    	leaf("&#xf06c;"),
    	fire("&#xf06d;"),
    	eye("&#xf06e;"),
    	eye_slash("&#xf070;"),
    	warning("&#xf071;"),
    	exclamation_triangle("&#xf071;"),
    	plane("&#xf072;"),
    	calendar("&#xf073;"),
    	random("&#xf074;"),
    	comment("&#xf075;"),
    	magnet("&#xf076;"),
    	chevron_up("&#xf077;"),
    	chevron_down("&#xf078;"),
    	retweet("&#xf079;"),
    	shopping_cart("&#xf07a;"),
    	folder("&#xf07b;"),
    	folder_open("&#xf07c;"),
    	arrows_v("&#xf07d;"),
    	arrows_h("&#xf07e;"),
    	bar_chart_o("&#xf080;"),
    	bar_chart("&#xf080;"),
    	twitter_square("&#xf081;"),
    	facebook_square("&#xf082;"),
    	camera_retro("&#xf083;"),
    	key("&#xf084;"),
    	gears("&#xf085;"),
    	cogs("&#xf085;"),
    	comments("&#xf086;"),
    	thumbs_o_up("&#xf087;"),
    	thumbs_o_down("&#xf088;"),
    	star_half("&#xf089;"),
    	heart_o("&#xf08a;"),
    	sign_out("&#xf08b;"),
    	linkedin_square("&#xf08c;"),
    	thumb_tack("&#xf08d;"),
    	external_link("&#xf08e;"),
    	sign_in("&#xf090;"),
    	trophy("&#xf091;"),
    	github_square("&#xf092;"),
    	upload("&#xf093;"),
    	lemon_o("&#xf094;"),
    	phone("&#xf095;"),
    	square_o("&#xf096;"),
    	bookmark_o("&#xf097;"),
    	phone_square("&#xf098;"),
    	twitter("&#xf099;"),
    	facebook("&#xf09a;"),
    	github("&#xf09b;"),
    	unlock("&#xf09c;"),
    	credit_card("&#xf09d;"),
    	rss("&#xf09e;"),
    	hdd_o("&#xf0a0;"),
    	bullhorn("&#xf0a1;"),
    	bell("&#xf0f3;"),
    	certificate("&#xf0a3;"),
    	hand_o_right("&#xf0a4;"),
    	hand_o_left("&#xf0a5;"),
    	hand_o_up("&#xf0a6;"),
    	hand_o_down("&#xf0a7;"),
    	arrow_circle_left("&#xf0a8;"),
    	arrow_circle_right("&#xf0a9;"),
    	arrow_circle_up("&#xf0aa;"),
    	arrow_circle_down("&#xf0ab;"),
    	globe("&#xf0ac;"),
    	wrench("&#xf0ad;"),
    	tasks("&#xf0ae;"),
    	filter("&#xf0b0;"),
    	briefcase("&#xf0b1;"),
    	arrows_alt("&#xf0b2;"),
    	group("&#xf0c0;"),
    	users("&#xf0c0;"),
    	chain("&#xf0c1;"),
    	link("&#xf0c1;"),
    	cloud("&#xf0c2;"),
    	flask("&#xf0c3;"),
    	cut("&#xf0c4;"),
    	scissors("&#xf0c4;"),
    	copy("&#xf0c5;"),
    	files_o("&#xf0c5;"),
    	paperclip("&#xf0c6;"),
    	save("&#xf0c7;"),
    	floppy_o("&#xf0c7;"),
    	square("&#xf0c8;"),
    	navicon("&#xf0c9;"),
    	reorder("&#xf0c9;"),
    	bars("&#xf0c9;"),
    	list_ul("&#xf0ca;"),
    	list_ol("&#xf0cb;"),
    	strikethrough("&#xf0cc;"),
    	underline("&#xf0cd;"),
    	table("&#xf0ce;"),
    	magic("&#xf0d0;"),
    	truck("&#xf0d1;"),
    	pinterest("&#xf0d2;"),
    	pinterest_square("&#xf0d3;"),
    	google_plus_square("&#xf0d4;"),
    	google_plus("&#xf0d5;"),
    	money("&#xf0d6;"),
    	caret_down("&#xf0d7;"),
    	caret_up("&#xf0d8;"),
    	caret_left("&#xf0d9;"),
    	caret_right("&#xf0da;"),
    	columns("&#xf0db;"),
    	unsorted("&#xf0dc;"),
    	sort("&#xf0dc;"),
    	sort_down("&#xf0dd;"),
    	sort_desc("&#xf0dd;"),
    	sort_up("&#xf0de;"),
    	sort_asc("&#xf0de;"),
    	envelope("&#xf0e0;"),
    	linkedin("&#xf0e1;"),
    	rotate_left("&#xf0e2;"),
    	undo("&#xf0e2;"),
    	legal("&#xf0e3;"),
    	gavel("&#xf0e3;"),
    	dashboard("&#xf0e4;"),
    	tachometer("&#xf0e4;"),
    	comment_o("&#xf0e5;"),
    	comments_o("&#xf0e6;"),
    	flash("&#xf0e7;"),
    	bolt("&#xf0e7;"),
    	sitemap("&#xf0e8;"),
    	umbrella("&#xf0e9;"),
    	paste("&#xf0ea;"),
    	clipboard("&#xf0ea;"),
    	lightbulb_o("&#xf0eb;"),
    	exchange("&#xf0ec;"),
    	cloud_download("&#xf0ed;"),
    	cloud_upload("&#xf0ee;"),
    	user_md("&#xf0f0;"),
    	stethoscope("&#xf0f1;"),
    	suitcase("&#xf0f2;"),
    	bell_o("&#xf0a2;"),
    	coffee("&#xf0f4;"),
    	cutlery("&#xf0f5;"),
    	file_text_o("&#xf0f6;"),
    	building_o("&#xf0f7;"),
    	hospital_o("&#xf0f8;"),
    	ambulance("&#xf0f9;"),
    	medkit("&#xf0fa;"),
    	fighter_jet("&#xf0fb;"),
    	beer("&#xf0fc;"),
    	h_square("&#xf0fd;"),
    	plus_square("&#xf0fe;"),
    	angle_double_left("&#xf100;"),
    	angle_double_right("&#xf101;"),
    	angle_double_up("&#xf102;"),
    	angle_double_down("&#xf103;"),
    	angle_left("&#xf104;"),
    	angle_right("&#xf105;"),
    	angle_up("&#xf106;"),
    	angle_down("&#xf107;"),
    	desktop("&#xf108;"),
    	laptop("&#xf109;"),
    	tablet("&#xf10a;"),
    	mobile_phone("&#xf10b;"),
    	mobile("&#xf10b;"),
    	circle_o("&#xf10c;"),
    	quote_left("&#xf10d;"),
    	quote_right("&#xf10e;"),
    	spinner("&#xf110;"),
    	circle("&#xf111;"),
    	mail_reply("&#xf112;"),
    	reply("&#xf112;"),
    	github_alt("&#xf113;"),
    	folder_o("&#xf114;"),
    	folder_open_o("&#xf115;"),
    	smile_o("&#xf118;"),
    	frown_o("&#xf119;"),
    	meh_o("&#xf11a;"),
    	gamepad("&#xf11b;"),
    	keyboard_o("&#xf11c;"),
    	flag_o("&#xf11d;"),
    	flag_checkered("&#xf11e;"),
    	terminal("&#xf120;"),
    	code("&#xf121;"),
    	mail_reply_all("&#xf122;"),
    	reply_all("&#xf122;"),
    	star_half_empty("&#xf123;"),
    	star_half_full("&#xf123;"),
    	star_half_o("&#xf123;"),
    	location_arrow("&#xf124;"),
    	crop("&#xf125;"),
    	code_fork("&#xf126;"),
    	unlink("&#xf127;"),
    	chain_broken("&#xf127;"),
    	question("&#xf128;"),
    	info("&#xf129;"),
    	exclamation("&#xf12a;"),
    	superscript("&#xf12b;"),
    	subscript("&#xf12c;"),
    	eraser("&#xf12d;"),
    	puzzle_piece("&#xf12e;"),
    	microphone("&#xf130;"),
    	microphone_slash("&#xf131;"),
    	shield("&#xf132;"),
    	calendar_o("&#xf133;"),
    	fire_extinguisher("&#xf134;"),
    	rocket("&#xf135;"),
    	maxcdn("&#xf136;"),
    	chevron_circle_left("&#xf137;"),
    	chevron_circle_right("&#xf138;"),
    	chevron_circle_up("&#xf139;"),
    	chevron_circle_down("&#xf13a;"),
    	html5("&#xf13b;"),
    	css3("&#xf13c;"),
    	anchor("&#xf13d;"),
    	unlock_alt("&#xf13e;"),
    	bullseye("&#xf140;"),
    	ellipsis_h("&#xf141;"),
    	ellipsis_v("&#xf142;"),
    	rss_square("&#xf143;"),
    	play_circle("&#xf144;"),
    	ticket("&#xf145;"),
    	minus_square("&#xf146;"),
    	minus_square_o("&#xf147;"),
    	level_up("&#xf148;"),
    	level_down("&#xf149;"),
    	check_square("&#xf14a;"),
    	pencil_square("&#xf14b;"),
    	external_link_square("&#xf14c;"),
    	share_square("&#xf14d;"),
    	compass("&#xf14e;"),
    	toggle_down("&#xf150;"),
    	caret_square_o_down("&#xf150;"),
    	toggle_up("&#xf151;"),
    	caret_square_o_up("&#xf151;"),
    	toggle_right("&#xf152;"),
    	caret_square_o_right("&#xf152;"),
    	euro("&#xf153;"),
    	eur("&#xf153;"),
    	gbp("&#xf154;"),
    	dollar("&#xf155;"),
    	usd("&#xf155;"),
    	rupee("&#xf156;"),
    	inr("&#xf156;"),
    	cny("&#xf157;"),
    	rmb("&#xf157;"),
    	yen("&#xf157;"),
    	jpy("&#xf157;"),
    	ruble("&#xf158;"),
    	rouble("&#xf158;"),
    	rub("&#xf158;"),
    	won("&#xf159;"),
    	krw("&#xf159;"),
    	bitcoin("&#xf15a;"),
    	btc("&#xf15a;"),
    	file("&#xf15b;"),
    	file_text("&#xf15c;"),
    	sort_alpha_asc("&#xf15d;"),
    	sort_alpha_desc("&#xf15e;"),
    	sort_amount_asc("&#xf160;"),
    	sort_amount_desc("&#xf161;"),
    	sort_numeric_asc("&#xf162;"),
    	sort_numeric_desc("&#xf163;"),
    	thumbs_up("&#xf164;"),
    	thumbs_down("&#xf165;"),
    	youtube_square("&#xf166;"),
    	youtube("&#xf167;"),
    	xing("&#xf168;"),
    	xing_square("&#xf169;"),
    	youtube_play("&#xf16a;"),
    	dropbox("&#xf16b;"),
    	stack_overflow("&#xf16c;"),
    	instagram("&#xf16d;"),
    	flickr("&#xf16e;"),
    	adn("&#xf170;"),
    	bitbucket("&#xf171;"),
    	bitbucket_square("&#xf172;"),
    	tumblr("&#xf173;"),
    	tumblr_square("&#xf174;"),
    	long_arrow_down("&#xf175;"),
    	long_arrow_up("&#xf176;"),
    	long_arrow_left("&#xf177;"),
    	long_arrow_right("&#xf178;"),
    	apple("&#xf179;"),
    	windows("&#xf17a;"),
    	android("&#xf17b;"),
    	linux("&#xf17c;"),
    	dribbble("&#xf17d;"),
    	skype("&#xf17e;"),
    	foursquare("&#xf180;"),
    	trello("&#xf181;"),
    	female("&#xf182;"),
    	male("&#xf183;"),
    	gittip("&#xf184;"),
    	sun_o("&#xf185;"),
    	moon_o("&#xf186;"),
    	archive("&#xf187;"),
    	bug("&#xf188;"),
    	vk("&#xf189;"),
    	weibo("&#xf18a;"),
    	renren("&#xf18b;"),
    	pagelines("&#xf18c;"),
    	stack_exchange("&#xf18d;"),
    	arrow_circle_o_right("&#xf18e;"),
    	arrow_circle_o_left("&#xf190;"),
    	toggle_left("&#xf191;"),
    	caret_square_o_left("&#xf191;"),
    	dot_circle_o("&#xf192;"),
    	wheelchair("&#xf193;"),
    	vimeo_square("&#xf194;"),
    	turkish_lira("&#xf195;"),
    	try_FI("&#xf195;"),
    	plus_square_o("&#xf196;"),
    	space_shuttle("&#xf197;"),
    	slack("&#xf198;"),
    	envelope_square("&#xf199;"),
    	wordpress("&#xf19a;"),
    	openid("&#xf19b;"),
    	institution("&#xf19c;"),
    	bank("&#xf19c;"),
    	university("&#xf19c;"),
    	mortar_board("&#xf19d;"),
    	graduation_cap("&#xf19d;"),
    	yahoo("&#xf19e;"),
    	google("&#xf1a0;"),
    	reddit("&#xf1a1;"),
    	reddit_square("&#xf1a2;"),
    	stumbleupon_circle("&#xf1a3;"),
    	stumbleupon("&#xf1a4;"),
    	delicious("&#xf1a5;"),
    	digg("&#xf1a6;"),
    	pied_piper("&#xf1a7;"),
    	pied_piper_alt("&#xf1a8;"),
    	drupal("&#xf1a9;"),
    	joomla("&#xf1aa;"),
    	language("&#xf1ab;"),
    	fax("&#xf1ac;"),
    	building("&#xf1ad;"),
    	child("&#xf1ae;"),
    	paw("&#xf1b0;"),
    	spoon("&#xf1b1;"),
    	cube("&#xf1b2;"),
    	cubes("&#xf1b3;"),
    	behance("&#xf1b4;"),
    	behance_square("&#xf1b5;"),
    	steam("&#xf1b6;"),
    	steam_square("&#xf1b7;"),
    	recycle("&#xf1b8;"),
    	automobile("&#xf1b9;"),
    	car("&#xf1b9;"),
    	cab("&#xf1ba;"),
    	taxi("&#xf1ba;"),
    	tree("&#xf1bb;"),
    	spotify("&#xf1bc;"),
    	deviantart("&#xf1bd;"),
    	soundcloud("&#xf1be;"),
    	database("&#xf1c0;"),
    	file_pdf_o("&#xf1c1;"),
    	file_word_o("&#xf1c2;"),
    	file_excel_o("&#xf1c3;"),
    	file_powerpoint_o("&#xf1c4;"),
    	file_photo_o("&#xf1c5;"),
    	file_picture_o("&#xf1c5;"),
    	file_image_o("&#xf1c5;"),
    	file_zip_o("&#xf1c6;"),
    	file_archive_o("&#xf1c6;"),
    	file_sound_o("&#xf1c7;"),
    	file_audio_o("&#xf1c7;"),
    	file_movie_o("&#xf1c8;"),
    	file_video_o("&#xf1c8;"),
    	file_code_o("&#xf1c9;"),
    	vine("&#xf1ca;"),
    	codepen("&#xf1cb;"),
    	jsfiddle("&#xf1cc;"),
    	life_bouy("&#xf1cd;"),
    	life_buoy("&#xf1cd;"),
    	life_saver("&#xf1cd;"),
    	support("&#xf1cd;"),
    	life_ring("&#xf1cd;"),
    	circle_o_notch("&#xf1ce;"),
    	ra("&#xf1d0;"),
    	rebel("&#xf1d0;"),
    	ge("&#xf1d1;"),
    	empire("&#xf1d1;"),
    	git_square("&#xf1d2;"),
    	git("&#xf1d3;"),
    	hacker_news("&#xf1d4;"),
    	tencent_weibo("&#xf1d5;"),
    	qq("&#xf1d6;"),
    	wechat("&#xf1d7;"),
    	weixin("&#xf1d7;"),
    	send("&#xf1d8;"),
    	paper_plane("&#xf1d8;"),
    	send_o("&#xf1d9;"),
    	paper_plane_o("&#xf1d9;"),
    	history("&#xf1da;"),
    	circle_thin("&#xf1db;"),
    	header("&#xf1dc;"),
    	paragraph("&#xf1dd;"),
    	sliders("&#xf1de;"),
    	share_alt("&#xf1e0;"),
    	share_alt_square("&#xf1e1;"),
    	bomb("&#xf1e2;"),
    	soccer_ball_o("&#xf1e3;"),
    	futbol_o("&#xf1e3;"),
    	tty("&#xf1e4;"),
    	binoculars("&#xf1e5;"),
    	plug("&#xf1e6;"),
    	slideshare("&#xf1e7;"),
    	twitch("&#xf1e8;"),
    	yelp("&#xf1e9;"),
    	newspaper_o("&#xf1ea;"),
    	wifi("&#xf1eb;"),
    	calculator("&#xf1ec;"),
    	paypal("&#xf1ed;"),
    	google_wallet("&#xf1ee;"),
    	cc_visa("&#xf1f0;"),
    	cc_mastercard("&#xf1f1;"),
    	cc_discover("&#xf1f2;"),
    	cc_amex("&#xf1f3;"),
    	cc_paypal("&#xf1f4;"),
    	cc_stripe("&#xf1f5;"),
    	bell_slash("&#xf1f6;"),
    	bell_slash_o("&#xf1f7;"),
    	trash("&#xf1f8;"),
    	copyright("&#xf1f9;"),
    	at("&#xf1fa;"),
    	eyedropper("&#xf1fb;"),
    	paint_brush("&#xf1fc;"),
    	birthday_cake("&#xf1fd;"),
    	area_chart("&#xf1fe;"),
    	pie_chart("&#xf200;"),
    	line_chart("&#xf201;"),
    	lastfm("&#xf202;"),
    	lastfm_square("&#xf203;"),
    	toggle_off("&#xf204;"),
    	toggle_on("&#xf205;"),
    	bicycle("&#xf206;"),
    	bus("&#xf207;"),
    	ioxhost("&#xf208;"),
    	angellist("&#xf209;"),
    	cc("&#xf20a;"),
    	shekel("&#xf20b;"),
    	sheqel("&#xf20b;"),
    	ils("&#xf20b;"),
    	meanpath("&#xf20c;");


        private final String id;

        private Icon(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return variant();
        }

        /**
         * Gets the character entity used for this {@link Icon}.
         * 
         * @return character entity
         */
        public String id() {
            return id;
        }

        /**
         * Gets the stylename used for this {@link Icon}.
         * 
         * @return the icon stylename
         */
        public String stylename() {
        	//_FI prepended for reserved words
            return "fa fa-" + name().replaceAll("_FI", "").replaceAll("_", "-");
        }

        /**
         * Gets the icon HTML with the given {@link IconVariant}s added.
         * <p>
         * Multiple {@link IconVariant}s can be used, but all combinations do
         * not make sense.
         * </p>
         * 
         * @param variants
         * @return
         */
        public String variant(IconVariant... variants) {
            String stylenames = stylename();
            for (IconVariant v : variants) {
                stylenames += " " + v;
            }
            return "<i class=\"" + stylenames + "\"></i>";
        }

    }
}
