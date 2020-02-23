package part3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xunmi
 * @ClassName FunctionInterfaceTestXunMi
 * @Description TODO
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class FunctionInterfaceTestXunMi {

    public static void main(String[] args) {
        Person person = (type -> {
            /* ���ݲ�ְͬҵ���ͣ��⽨�ֻ����� */
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(random.nextInt(10));
            }
            switch (type) {
                case "ѧ��":
                    return "136" + stringBuilder;
                case "��ʦ":
                    return "137" + stringBuilder;
                case "����":
                    return "138" + stringBuilder;
                case "����":
                    return "139" + stringBuilder;
                default:
                    return "%%%***%%%***%%%";
            }
        });
        Scanner scanner = new Scanner(System.in);
        System.out.println("��ѡ�����ְҵ���ͣ�ѧ������ʦ�����ˣ�������");
        String type = scanner.nextLine();
        String phoneNumber = person.getPhone(type);
        if (phoneNumber.equals("%%%***%%%***%%%")) {
            System.out.println("����ȷѡ��ְҵ����");
        } else {
            System.out.println("��������������ֻ�����Ϊ��" + phoneNumber);
        }
        scanner.close();
    }
}

@FunctionalInterface
interface Person {

    /**
     * �⽨�ֻ��ŵķ���
     *
     * @param type �Լ���ְҵ����
     * @return �⽨�������ֻ���
     */
    String getPhone(String type);
}


