import {FileMarkdownFilled, GithubOutlined, GitlabFilled} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';

const Footer: React.FC = () => {
  const defaultMessage = 'GOD hx';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'email',
          title:  <><FileMarkdownFilled/>176804446@qq.com</>,
          href: '',
          blankTarget: true,
        },
        {
          key: 'codeNav',
          title: <><GitlabFilled/> hx GitLab</>,
          href: 'https://gitee.com/hx99999',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <><GithubOutlined/> hx GitHub</>,
          href: 'https://github.com/hx999999',
          blankTarget: true,
        },

      ]}
    />
  );
};

export default Footer;
